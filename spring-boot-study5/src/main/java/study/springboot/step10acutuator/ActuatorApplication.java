package study.springboot.step10acutuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *    2019.09.11  Spring Actuator 학습
 *
 *    Actuator란 ? : 스프링 부트 어플리케이션 운영환경에서 유용한 기능을 제공하는 모듈
 *                  스프링 부트가 제공하는 앤드포인트, 메트릭스 그리고 그 데이터를 활용하는 모니터링 기능을 제
 *
 *        - auditevents : 인증정보, 인증 이벤트를 담고있다.
 *        - beans       : 등록된 빈정보
 *        - conditions  : 자동설정이 어떤 조건에 의해 적용됙고 안되고를 담고 있음.
 *        - configprops : condifguration 안에있는 properties에 대한 정보
 *        - env         : Environment 안에있는 properties 정보
 *        - flyway      : (데이터 마이그래이션) flyway에 대한 정보
 *        - health      : 어플리케이션이 어떤 상태인지
 *        - httptrace   : 최근 http 요청과 응답 100개의 정보 (시간 등)
 *        - info
 *        - logger      : 어떤 패키지가 어떤 로깅 레벨을 가지고있는지, 또한 수정가능 등
 *        - liquibase   : (데이터 마이그래이션) liquibase에 대한 정보
 *        - metrics     : 어플리케이션의 핵심 정보 (메모리, cpu)들을 공동의 포맷으로 제공 -> 제3의 모니터링 어플리케이션과 함께 사용
 *        - mapping     : 컨트롤러 매핑정보를 보여줌
 *        - scheduledtasks  : @schedule 어노테이션 사용시 배치처럼 주기적으로 돌도록 할 수 있는데, 어플리케이션에 적용된 스케줄에 대한 정보가 담겨있음
 *        - sessions    : 스프링 세션 관련된 정보
 *        - shutdown    : 어플리케이션을 끌 수 있는 앤드포인트 , 위험하기 때문에 비활성화 되어 있음.
 *
 *    Spring Boot Admin : Acutuator UI 제공
 *
 */
@SpringBootApplication
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

}
