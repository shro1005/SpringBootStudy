package study.springboot.step6sqldb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;   /** 기본적인 jdbc사용 하는 법*/

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try (Connection conn = dataSource.getConnection()){
            String url = conn.getMetaData().getURL();
            String username = conn.getMetaData().getUserName();

            System.out.println("H2Runner -> url : " + url + " / username : " + username);

            Statement stmt = conn.createStatement();
            String query = "CREATE TABLE USER (ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
            stmt.executeUpdate(query);
        }

        String q2 = "INSERT INTO USER VALUES (1, 'kyun')";
        jdbcTemplate.execute(q2);
    }
}
