package study.springboot.step4springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *   DemoSpringMvcApplication       2019.08.28 Spring MVC학습
 *      - 스프링 부트에서 자동설정으로 스프링 MVC를 사용가능하도록 한다. WebServicesAutoConfiguration.class 참고
 */

@SpringBootApplication
public class DemoSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringMvcApplication.class, args);
    }
}
