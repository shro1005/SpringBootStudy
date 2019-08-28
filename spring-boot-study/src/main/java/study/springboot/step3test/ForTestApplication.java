package study.springboot.step3test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  ForTestApplication      2019.08.27 Test 학습
 */
@SpringBootApplication
public class ForTestApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ForTestApplication.class);
        application.run(args);
    }
}
