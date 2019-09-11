package study.springboot.step7nosql.account;

//import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepositoryMongo  /* extends MongoRepository<AccountForMongo, String> */ {
    AccountForMongo findByUsername(String username);
}
