package study.springboot.step1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
/**
 *   Application 	 2019.08.22. Spring 자동설정의 이해
 */

@SpringBootApplication           // SpringBootApplication은 아래 3개의 어노테이션을 합친것과 같다. 
/** @SpringBootConfiguration        
*   @ComponentScan					ComponentScan으로 빈을 읽어서 등록한다음
*   @EnableAutoConfiguration        EnableAutoConfiguration으로 한번더 읽어서 등록한다(또 웹어플리케이션 설정 등과 같은 추가적인 빈 또한 여기서 등록). 즉, SpringBoot는 빈을 2번 등록하는 구조로 되어있다.
*									또 spring-boot-autoconfiguration 의존성의 META-INF의 spring.factories를 읽어 자동 등록하는 설정들을 읽어들인다.
*/
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
