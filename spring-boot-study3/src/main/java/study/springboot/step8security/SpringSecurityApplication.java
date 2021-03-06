package study.springboot.step8security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot가 제공하는 Spring security 기능 (spring-boot-start-security 의존성 사용시)
 * - default : 모든 인증이 다 spring securtiy로 인해 인증이 필요해짐.
 * 베이직 인증, 폼 인증이 모두 적용이된다. (베이직인증은 accept 해더(응답이 원하는 형태 ex. JSON이냐 XML이냐 등)에 따라 달러진다.)
 * <p>
 * - Spring Security 설정 커스터마이징
 * *          1. 웹 시큐리티 설정 커스터마이징 -> WebSecurityConfig.class 참고
 * 2. 유저 디테일 설정 커스터마이징 -> AccountService.class 참고               https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#jc-authentication-userdetailsservice 참고
 * 3. 패스워드 인코더 커스터마이 -> WebSecurityConfig.class,  AccountService.class 참고             https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#core-services-password-encoding
 */
@SpringBootApplication
public class SpringSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
}
