package study.springboot.step5springmvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import study.springboot.step4springmvc.SpringMvcApplication1;

/**
 * SpringMvcApplication    2019.08.30  Spring Boot를 사용한 Spring MVC 어플리케이션 활용
 * <p>
 * ==============================================================================================================================
 * 5. Spring Boot를 사용한 Spring MVC 애플리케이션으로 동적 컨텐츠 생성하는 방법
 * 템플릿 엔진이란? : 주로 뷰(MVC에서 View를 담당)로 만들지만 뷰만 만드는게 쓰이는 것이 아님, 코드 제너레이션이나 이메일 템플릿 등을 만들 수 있다.
 * 스프링 부트가 자동설정 지원하는 템플릿 엔진
 * - FreeMarker
 * - Groovy
 * - Thymelef (주로 사용)
 * - Mustache
 * - (JSP는 자동 지원 X, 권장하지 않음 -> Jar 패키징시 동작하지 않고 war 패키징을 해야
 * <p>
 * 템플릿 파일 위치는 src/main/resource/templates 이다.
 * <p>
 * ==============================================================================================================================
 * 6. HTMLUnit : HTML 테스트를 보다 쉽게 할 수 있도록 해주는 의존성이다. (모두 테스트 스코프)
 * <dependency>
 * <groupId>org.seleniumhq.selenium</groupId>
 * <artifactId>htmlunit-driver</artifactId>
 * <scope>test</scope>
 * </dependency>
 * <dependency>
 * <groupId>net.sourceforge.htmlunit</groupId>
 * <artifactId>htmlunit</artifactId>
 * <scope>test</scope>
 * </dependency>
 * <p>
 * ==============================================================================================================================
 * 7.ExceptionHandler : 에러 발생시 handling하는 역할
 * 스프링부트는 기본적으로 ExceptionHandler를 제공한다.
 * <p>
 * ==============================================================================================================================
 * 8. Spring HATEOAS :  HATEOAS를 구현하기 위한 편의성을 제공하는 라이브러리
 * HATEOAS란 ? : rest api를 만들때  서버는 리소스에 대한 정보를 제공할 때 리소스에 연관된 링크 정보도 같이 제공을 해주고
 * 클라이언트는 연관된 링크 정보를 바탕으로 리소스에 접근하는 방법이다.
 */

@SpringBootApplication
public class SpringMvcApplciation2 {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplciation2.class);
    }
}
