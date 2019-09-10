package study.springboot.step7nosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import study.springboot.step7nosql.account.Account;
import study.springboot.step7nosql.account.AccountRepository;

import java.util.Optional;

@Component
public class RedisRunner implements ApplicationRunner {
    @Autowired
    StringRedisTemplate redisTemplate;  /** 2019.09.05 */

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ValueOperations<String, String> values = redisTemplate.opsForValue();
        values.set("kyun", "Adwin");
        values.set("springboot", "2.1.7");
        values.set("Hello", "World");

        Account account = new Account();
        account.setEmail("adwin@kim.com");
        account.setUsername("kyun");

        accountRepository.save(account);

        Optional<Account> insertedAccount = accountRepository.findById(account.getId());
        System.out.println("Redis Runner --> username : "+insertedAccount.get().getUsername());
        System.out.println("Redis Runner --> email : "+insertedAccount.get().getEmail());
    }
}
