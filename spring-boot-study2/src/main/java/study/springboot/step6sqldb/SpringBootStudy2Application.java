package study.springboot.step6sqldb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  2019.09.01   Spring Boot 를 활용한 SQL 연동 학습
 *
 *      1. 인메모리 데이터베이스 (H2 ..)
 *         URL: “testdb”
 *         username: “sa”
 *         password: “”    기본적으로 스프링 부트에서 세팅해준 데이터베이스
 */
@SpringBootApplication
public class SpringBootStudy2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudy2Application.class, args);
	}

}
