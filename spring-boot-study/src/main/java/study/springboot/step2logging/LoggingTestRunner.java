package study.springboot.step2logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LoggingTestRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(LoggingTestRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("LoggerTest : ========================================");
        logger.debug("LoggerTest : Use SLF4j logging Facade --> Logback Logger");
        logger.debug("LoggerTest : ========================================");
    }
}
