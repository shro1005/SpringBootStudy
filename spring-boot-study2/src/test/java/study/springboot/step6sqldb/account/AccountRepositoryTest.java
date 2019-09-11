package study.springboot.step6sqldb.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
// DataJpaTest : slicing test -> Repository 에 관련된 빈만 데스트 , 임베디드 데이터베이스가 필요하다, 즉 태스트 스코프에 데이터베이스 의존성을 추가해야한다.
public class AccountRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void dataTest() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getURL());
            System.out.println(metaData.getDriverName());
            System.out.println(metaData.getUserName());

            Account account = new Account();
            account.setUsername("kyun");
            account.setPassword("pass");

            Account newAccount = accountRepository.save(account);
            assertThat(newAccount).isNotNull();

            Account existAccount = accountRepository.findByUsername(newAccount.getUsername());
            assertThat(existAccount).isNotNull();

            Account nonExistAccount = accountRepository.findByUsername("Adwin");
            assertThat(nonExistAccount).isNull();
        }
    }
}
