package study.springboot.step1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 *  ArgumentTest   2019.08.26  Application 아큐먼트 받는 방법 학습
 */
@Component
public class ArgumentTest {
    public ArgumentTest(ApplicationArguments arguments) {
        System.out.println("ArgumentsTest : foo -> " + arguments.containsOption("foo"));  // VM Options은 애플리케이션 아규먼트로 얻어올 수 없다.
        System.out.println("ArgumentsTest : bar -> " + arguments.containsOption("bar"));  // Project Arguments는 애플리케이션 아규먼트로 얻어올 수 있다.
    }
}
