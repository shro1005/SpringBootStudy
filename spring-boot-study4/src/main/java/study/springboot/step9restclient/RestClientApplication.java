package study.springboot.step9restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**   2019.09.11  Spring Boot에서 제공하는 RestClient 학습
 *  Rest란?  Client가 자원의 상태(정보)에 대한 조작을 요청하면 Server는 이에 적절한 응답(Representation)을 보낸다.
 *          REST에서 하나의 자원은 JSON, XML, TEXT, RSS 등 여러 형태의 Representation으로 나타내어 질 수 있다.
 *
 *  Rest Client는  우리가 Open API를 사용할 때 해당 API 를 제공하는 서버로부터 URI로 자료를 요청하기 위해 필요하다.
 *
 *      종류  1. RestTemplate : 동기화(synchronous) 되어있음, 자주 사용하지 않음
 *           2. WebClient    : 비동기(asynchronous) 되어있음, 사용 권장 , 여러 API를 조합해서 사용할 수 있음.
 */
@SpringBootApplication
public class RestClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }
/* 전역적인 webclient 설정을 바꾸고 싶은경우 webClientCustomizer를 빈으로 등록하면 된다.
    @Bean
    public WebClientCustomizer webClientCustomizer() {
        return new WebClientCustomizer() {
            @Override
            public void customize(WebClient.Builder webClientBuilder) {
                webClientBuilder.baseUrl("http://localhost:8080");
            }
        };
    }
*/
}
