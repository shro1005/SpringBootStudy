package study.springboot.step1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import example.external.dependency.examplespringbootstarter.MyBook;

/**
 * Application 	 2019.08.22. Spring 자동설정의 이해 & 019.08.27. 외부설정 학습 (타입 세이프티한 프로퍼티 설정 방법
 */

@SpringBootApplication           // SpringBootApplication은 아래 3개의 어노테이션을 합친것과 같다. 
/** @SpringBootConfiguration
 *   @ComponentScan ComponentScan으로 빈을 읽어서 등록한다음
 *   @EnableAutoConfiguration EnableAutoConfiguration으로 한번더 읽어서 등록한다(또 웹어플리케이션 설정 등과 같은 추가적인 빈 또한 여기서 등록). 즉, SpringBoot는 빈을 2번 등록하는 구조로 되어있다.
 *									또 spring-boot-autoconfiguration 의존성의 META-INF의 spring.factories를 읽어 자동 등록하는 설정들을 읽어들인다.
 */
// @EnableConfigurationProperties(TypeSafetyProperties.class)  /** 2019.08.27. 외부설정 학습 (타입 세이프티한 프로퍼티 설정 방법*/
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
//		application.addListeners(new SampleApplicationListener());     /** 2019.08.26 Application실행시 발생하는 Event들 추가 학습 */
        application.run(args);
    }

    @Bean
    public MyBook myBook() {
        MyBook myBook = new MyBook();
        myBook.setName("name");
        myBook.setPage(1);
        myBook.setWriter("writer");
        return myBook;
    }
}
