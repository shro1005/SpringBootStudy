package example.external.dependency.examplespringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * BookConfiguration    2019.08.22 Spring Boot 자동설정 학습
 */
@Configuration
public class BookConfiguration {
    /* 2019.08.22 Spring Boot 자동설정 학습 */
    @Bean
    @ConditionalOnMissingBean
    public MyBook myBook() {
        MyBook myBook = new MyBook();
        myBook.setName("SpringBootStudy");
        myBook.setPage(10);
        myBook.setWriter("kyun");
        return myBook;
    }

}