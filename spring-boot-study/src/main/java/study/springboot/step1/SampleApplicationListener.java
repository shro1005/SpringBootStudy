package study.springboot.step1;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * SampleApplicationListener 2019.08.26   ApplicationStartingEvent의 경우 Application Context가 만들어지기 전에 발생하는 이벤트이기 때문에 빈 등록을 해도 소용이 없다.
 * ApplicationStartedEvent의 경우 Application Context가 만들어 진 이후에 발생하는 이벤트이기 때문에 빈 등록만 해도 자동으로 Listener가 추가된다.
 */

//@Component    ApplicationStartingEvent의 경우 Application Context가 만들어지기 전에 발생하는 이벤트이기 때문에 빈 등록을 해도 소용이 없다.
//public class SampleApplicationListener implements ApplicationListener<ApplicationStartingEvent> {
//    @Override
//    public void onApplicationEvent(ApplicationStartingEvent event) {
//        System.out.println("========================");
//        System.out.println("Application is starting!");
//        System.out.println("========================");
//    }
//}

@Component
public class SampleApplicationListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("========================");
        System.out.println("Application is started!");
        System.out.println("========================");
    }
}
