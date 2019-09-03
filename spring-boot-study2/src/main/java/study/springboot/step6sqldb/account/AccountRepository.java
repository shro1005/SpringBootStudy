package study.springboot.step6sqldb.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.ResultSet;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);

//    @Query(nativeQuery = true, value = "insert into account(username, password) values ('{0}', '{1}')")
//    ResultSet insertUser(String username, String password);

    @Query(nativeQuery = true, value = "select * from account where username = ?1")
    Account selectByUsername(String username);
}
