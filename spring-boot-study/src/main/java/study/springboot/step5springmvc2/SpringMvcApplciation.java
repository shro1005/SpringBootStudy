package study.springboot.step5springmvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  SpringMvcApplication    2019.08.30  Spring Boot를 사용한 Spring MVC 어플리케이션 활용
 *
 *  ==============================================================================================================================
 *        5. Spring Boot를 사용한 Spring MVC 애플리케이션으로 동적 컨텐츠 생성하는 방법
 *          템플릿 엔진이란? : 주로 뷰(MVC에서 View를 담당)로 만들지만 뷰만 만드는게 쓰이는 것이 아님, 코드 제너레이션이나 이메일 템플릿 등을 만들 수 있다.
 *          스프링 부트가 자동설정 지원하는 템플릿 엔진
 *             - FreeMarker
 *             - Groovy
 *             - Thymelef (주로 사용)
 *             - Mustache
 *             - (JSP는 자동 지원 X, 권장하지 않음 -> Jar 패키징시 동작하지 않고 war 패키징을 해야
 *
 *          템플릿 파일 위치는 src/main/resource/templates 이다.
 *
 *  ==============================================================================================================================
 *        6. HTMLUnit : HTML 테스트를 보다 쉽게 할 수 있도록 해주는 의존성이다. (모두 테스트 스코프)
 *          <dependency>
 *              <groupId>org.seleniumhq.selenium</groupId>
 *              <artifactId>htmlunit-driver</artifactId>
 *              <scope>test</scope>
 *          </dependency>
 *          <dependency>
 *              <groupId>net.sourceforge.htmlunit</groupId>
 *              <artifactId>htmlunit</artifactId>
 *               <scope>test</scope>
 *          </dependency>
 */

@SpringBootApplication
public class SpringMvcApplciation {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplciation.class);
    }
}
