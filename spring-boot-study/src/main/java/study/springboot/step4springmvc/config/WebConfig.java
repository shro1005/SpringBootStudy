package study.springboot.step4springmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebConfig     2019.08.28 Spring boot MVC 학습
 * 스프링 MVC 확장 : 추가적인 설정들을 적용하기 위함 -> @Configuration + WebMvcConfigurer
 * 스프링 MVC 재정의 : 본적으로 부트가 제공해주는 설정은 날아가버림 -> @Configuration + @EnableWebMvc
 */
@Configuration
//@EnableWebMvc      /** 스프링 MVC를 모두 이 클래스에서 재정의 해야한다. 기본적으로 부트가 제공해주는 설정은 날아가버림*/
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/m/**")
                .addResourceLocations("classpath:/m/")
                .setCachePeriod(20);
    }
}
