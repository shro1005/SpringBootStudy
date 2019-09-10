package study.springboot.step7nosql.account;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository  extends CrudRepository<Account, String> {
}
