package study.springboot.step2logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * LoggingApplication      2019.08.27 Logger & Logging 퍼사드 학습
 * <p>
 * 로깅 퍼사드  vs  로거
 * 로깅 퍼사드 : 실제로 로깅을 하는 로거 API를 추상화 해 놓은 인터페이스들이다. (Commons Logging, SLF4j)
 * 로거      : 실제로 로깅을 하는 코드가 담긴 API들  (JUL, Log4j, Logback)
 * 대부분의 프로젝트에서는 로깅 퍼사드를 통해서 로거를 사용하는 편이다. (이유 : 로깅 퍼사드에서 원하는 로거를 바꿔서 사용할 수 있기 때문이다. 확장성 보유)
 * <p>
 * 로깅 설정들  application.properties 확인
 * 1. 로깅 색깔 적용 -> application.properties에  spring.output.enabled=always 등록
 * 2. 로깅 파일 출력 -> application.properties에  logging.file || logging.path 등록  -> path에 등록하면 등록한 경로에 spring.log 파일이 쓰여진다.
 * 3. 로깅 레벨 조정 -> 패키지 별로 조정가능  application.properties에 logging.level.패키지경 = 로그 레벨 등
 * 4. 로깅 커스터 마이징 -> classpath에 logback-spring.xml 생성 , 참고문헌에서 제공하는 소스를 추가한 후 자유롭게 커스터마이징 가능하다.
 */
@SpringBootApplication
public class LoggingApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(LoggingApplication.class);
        application.run(args);
    }
}
