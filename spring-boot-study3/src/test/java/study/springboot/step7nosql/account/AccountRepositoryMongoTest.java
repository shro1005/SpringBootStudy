package study.springboot.step7nosql.account;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataMongoTest
public class AccountRepositoryMongoTest {
    @Autowired
//    AccountRepositoryMongo accountRepository;

    @Test
    public void findbyNm() {
        AccountForMongo account = new AccountForMongo();
        account.setUsername("kyun");
        account.setEmail("aaaa@bbbb");

//        accountRepository.insert(account);
//
//        accountRepository.findById(account.getId());
//        accountRepository.findByUsername(account.getUsername());
    }

}
