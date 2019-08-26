package study.springboot.step1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import example.external.dependency.examplespringbootstarter.MyBook;


/**
 * BookRunner   2019.08.22. SpringBoot 자동설정 학습 (내가 만든 외부 프로젝트를 의존성으로 받아 자동 설정 하는 방법)
 */
@Component
public class BookRunner implements ApplicationRunner {

    @Autowired
    MyBook myBook;   // 다른 프로젝트의 MyBook 객체를 호출

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(myBook.toString());
    }
    
    

    
}