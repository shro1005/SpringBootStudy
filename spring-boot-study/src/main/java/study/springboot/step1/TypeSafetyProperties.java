package study.springboot.step1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

/**
 *  TypeSafetyProperties    2019.08.27. 외부설정 학습 (타입 세이프티한 프로퍼티 설정 방법
 *                          @ConfigurationProperties 어노테이션을 사용하면 application.properties의 설정한 외부 프로퍼티들을 묶어서 불러올수 있으 며
 *                           또 그 프로퍼티들을 빈으로 등록하여 다른 빈에 주입할 수 있다.
 *
 *                          @ConfigurationProperties 바인딩한 변수들을 애플리케이션에서 처리 및 사용할 수 있도록 @EnableConfigurationProperties를 설정해줘야한다.
 */
@Component    /** EnableConfigurationProperties는 기본적으로 애플리케이션에 주입되어 있기 때문에 그냥 Properties를 담고있는 클래스를 빈으로 등록하면 된다.*/
@ConfigurationProperties("kyun")
@Validated   /** 검증 할수 있다.*/
public class TypeSafetyProperties {
    @NotEmpty
    String name;

    int age;

    String fullname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
