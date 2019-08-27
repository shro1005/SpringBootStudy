package study.springboot.step1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 *      ExternalConfigTestRunner    2019.08.26 외부 설정 학습 (application.properties에 설정한 값들 불러 오기 및 외부설정 우선순위 학습)
 *                                  우선 순의의 경우 문서 참고
 */
@Component
public class ExternalConfigTestRunner implements ApplicationRunner {

//    @Value("kyun.name")   // resource의 application.properties 에 있는 설정을 불러올 수 있다.
//    private String name;
//
//    @Value("kyun.age")
//    private  int age;

    @Autowired     /** 2019.08.27 외부 설정 (@ConfigurationProperties를 사용한 타입 세이프티한 프로퍼티 활용) */
    TypeSafetyProperties typeSafetyProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("========================");
        System.out.println("외부설정 Test : name -> " + typeSafetyProperties.getName());
        System.out.println("외부설정 Test : age -> " + typeSafetyProperties.getAge());
        System.out.println("외부설정 Test : fullname -> " + typeSafetyProperties.getFullname());
        System.out.println("========================");
    }
}
