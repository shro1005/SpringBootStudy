package study.springboot.step4springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *   DemoSpringMvcApplication       2019.08.28 Spring MVC학습
 *      - 스프링 부트에서 자동설정으로 스프링 MVC를 사용가능하도록 한다. WebServicesAutoConfiguration.class 참고
 *
 *      1. HttpMessageConverter  : HTTP요청 본문을 객체로 변경하거나, 객체를 HTTP 응답 본문으로 변경할 때 사용
 *                                 @ResponseBody , @RequestBody와 함께 사용한다. (해당 어노테이션을 사용하면 요청, 응답이 HttpMessageConverter로 들어가 전환된다)
 *                                 하지만 @RestController를 사용하면 위의 어노테이션을 생력해서 사용할 수 있다.
 *==============================================================================================================================
 *      2. ContentNegotiationViewResolver : ViewResolver중에 하나로, 들오오는 요청의 accept header에 따라 응답을 다르게 할 수 있다.
 *                                          즉, 클라이언트가 원하는 응답 타입에 따라 그 타입의 뷰를 매칭시켜준다.
 *                 (*) accept header란 ? : 브라우저(클라이언트)가 어떠한 타입의 응답을 원하는지 서버에게 알려주는 정보이다.
 *==============================================================================================================================
 *      3. 정적 리소스 매핑
 *      (*) 정적 리소스란 ? : 서버에서 선행처리할 필요가  없는 정적 리소스 파일은 (xml, html, js, css, jpg, gif) 웹브라우저를 통해 직접 접속할 수 있도록 해야 하며 Controller 를
 *                        경유하지 않아도 화면에 출력되거나 다운로드가 될 수 있도록 설정해주어야 한다. Spirng Boot에서는 이를 자동으로 매핑해주고 있다.
 *        Spring Boot에서는 기본적으로 아래의 경로에 정적 리소르를 넣으면  /** 매핑 된다.
 *           -   classpath:/static   예) “/hello.html” => /static/hello.html
 *           -   classpath:/public
 *           -   classpath:/resources/
 *           -   classpath:/META-INF/resources
 *           -   spring.mvc.static-path-pattern: 맵핑 설정 변경 가능   ex) spring.mvc.static-path-pattern=/static/**
 *           -   spring.mvc.static-locations: 리소스 찾을 위치 변경 가능  --> 기본 리소스 위치를 전부 날리기 때문에 사용하지 않는것이 좋음.
 *           -   WebMvcConfigurer의 addRersourceHandlers로 커스터마이징 할 수 있음   (WebConfig.class 참고)
 */

@SpringBootApplication
public class DemoSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringMvcApplication.class, args);
    }
}
