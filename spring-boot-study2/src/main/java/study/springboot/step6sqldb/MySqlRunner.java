package study.springboot.step6sqldb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import study.springboot.step6sqldb.account.Account;
import study.springboot.step6sqldb.account.AccountRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *  2019.09.01  Spirng Boot를 활용한 db 연동
 */
@Component
public class MySqlRunner/*H2Runner*/ implements ApplicationRunner {
    @Autowired
    DataSource dataSource;   /** 기본적인 jdbc사용 하는 법*/

    @Autowired
    JdbcTemplate jdbcTemplate;  /** datasource 보다 훨씬 간편하고 안전하게 db와 커넥션을 맺고 쿼리를 날릴수 있다.*/

    @Autowired  /**2019.09.03 JPA 적용*/
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try (Connection conn = dataSource.getConnection()){    /**  이부분은 어떤 SQL을 사용하던 비슷하다. Connection, Statement 사용하는 것들 */
            String url = conn.getMetaData().getURL();
            String username = conn.getMetaData().getUserName();
            System.out.println("MySqlRunner -> driverName : "+conn.getMetaData().getDriverName());
            System.out.println("MySqlRunner -> url : " + url + " / username : " + username);

//            Statement stmt = conn.createStatement();
//            String query = "CREATE TABLE ACCOUNT (ID INTEGER NOT NULL, username VARCHAR(255), password VARCHAR(255) , PRIMARY KEY (id))";
//            stmt.executeUpdate(query);
            /** 2019.09.03 JPA를 사용 (JpaRepository )*/
//            String name = "Adwin";
//            Account example = new Account();
////            example.setId(1);
//            example.setUsername(name);
//            example.setPassword("pass");
//            example.setActive(true);  /** 2019.09.05 데이터베이스 마이그레이션 테스트를 위한 신규 칼럼 추가 및 데이터 추가*/
//            accountRepository.save(example);

            Account account = accountRepository.selectByUsername("Adwin");
            System.out.println("JPA Test Runner : select is work (username : " + account.getUsername() + " / password : " + account.getPassword() + ")");

        }

//        String q2 = "INSERT INTO ACCOUNT VALUES (1, 'kyun')";
//        jdbcTemplate.execute(q2);


    }
}
