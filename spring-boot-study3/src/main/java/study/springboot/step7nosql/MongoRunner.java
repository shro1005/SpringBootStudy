package study.springboot.step7nosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import study.springboot.step7nosql.account.AccountForMongo;

import java.util.Optional;

@Component
public class MongoRunner {//implements ApplicationRunner {
//    @Autowired
//    MongoTemplate mongoTemplate;
//
//    @Autowired
//    MongoRepository mongoRepository;
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        AccountForMongo account = new AccountForMongo();
//        account.setEmail("adwin@kim");
//        account.setUsername("kyun");
//
////        mongoTemplate.insert(account);
//        mongoRepository.insert(account);
//
//        Optional<AccountForMongo> insertedAccount = mongoRepository.findById(account.getId());
//        System.out.println("Mongo Runner --> username : "+insertedAccount.get().getUsername());
//        System.out.println("Mongo Runner --> email : "+insertedAccount.get().getEmail());
//    }
}
