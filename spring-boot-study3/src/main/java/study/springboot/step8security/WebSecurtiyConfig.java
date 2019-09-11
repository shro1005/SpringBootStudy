package study.springboot.step8security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * WebSecurityConfig     2019.09.10   Spring Securtiy 커스터 마이징
 */
@Configuration
public class WebSecurtiyConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/welcome").permitAll()   /** 해당 화면은 허가한다는 의미*/
                .anyRequest().authenticated()                           /** 나머지 화면들은 인증이 필요하다.*/
                .and()
                .formLogin().and()                                      /** form login을 해야한다.*/
                .httpBasic();                                           /** http 베이직 인증 해야한다.*/
    }

    @Bean
    public PasswordEncoder passwordEncoding() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
