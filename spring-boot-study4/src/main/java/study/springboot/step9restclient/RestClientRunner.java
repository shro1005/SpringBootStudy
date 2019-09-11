package study.springboot.step9restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class RestClientRunner implements ApplicationRunner {
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Autowired
    WebClient.Builder builder;

    /**현재 Runner에서만 Builder를 사용하고 싶을 때 -> 생성자를 만들어서 builder를 받아서 webclient를 사용하면 된다.*/
    WebClient webClient;
    public RestClientRunner(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    public void run(ApplicationArguments args) throws Exception {
        // TODO  RestTamplate를 이용한 RestClient 예제  -> sync
//        RestTemplate restTemplate = restTemplateBuilder.build();
//
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//
//        // TODO call hello
//        String helloResult = restTemplate.getForObject("http://localhost:8080/hello", String.class);
//        System.out.println("RestClientRunner -> " + helloResult);
//
//        // TODO call world
//        String worldResult = restTemplate.getForObject("http://localhost:8080/world", String.class);
//        System.out.println("RestClientRunner -> " + worldResult);
//
//        stopWatch.stop();
//        System.out.println("RestClientRunner -> stopwatch time : " + stopWatch.prettyPrint());

        // TODO WebClient를 이용한 RestClient 예제  -> async
          WebClient webClient = builder /**  .baseUrl("http://localhost:8080")  /** base url 설정가능하다.*/
                                       .build();

          StopWatch stopWatch = new StopWatch();
          stopWatch.start();

          Mono<String> helloMono = webClient.get().uri("http://localhost:8080/hello")   /** base url 설정시 /hello 만 입력하면 됨.*/
                .retrieve()   // 위의 uri의 데이터를 가져와라
                .bodyToMono(String.class);// String 클래스의 모토 타입으로 변경해라

          helloMono.subscribe(s -> {  /** streaming api 는 subscribe를 해야 일을 처리한다. */
              System.out.println("RestClientRunner -> " +s);
              if(stopWatch.isRunning()) {
                  stopWatch.stop();
              }
              System.out.println("RestClientRunner -> " + stopWatch.prettyPrint());
              stopWatch.start();
          });

        Mono<String> worldMono = webClient.get().uri("http://localhost:8080/world")
                .retrieve()   // 위의 uri의 데이터를 가져와라
                .bodyToMono(String.class);// String 클래스의 모토 타입으로 변경해라

        worldMono.subscribe(s -> {  /** streaming api 는 subscribe를 해야 일을 처리한다. */
            System.out.println("RestClientRunner -> " +s);
            if(stopWatch.isRunning()) {
                stopWatch.stop();
            }
            System.out.println("RestClientRunner -> " + stopWatch.prettyPrint());
            stopWatch.start();
        });
    }
}
