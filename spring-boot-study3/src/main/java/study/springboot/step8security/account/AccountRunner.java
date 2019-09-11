package study.springboot.step8security.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import study.springboot.step8security.account.Account;
import study.springboot.step8security.account.AccountService;

@Component
public class AccountRunner implements ApplicationRunner {
    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = accountService.createAccount("kyun", "1234");
        System.out.println("Account Runner => username : " + account.getUsername() + " / password : " + account.getPassword());

    }
}
