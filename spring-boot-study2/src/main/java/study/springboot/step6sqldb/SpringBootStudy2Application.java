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
 *
 *      2. MySQL 연동 (라이센스 비용 지불 필요,  소스 공개 필요 - 사용해서 잘 쓰지 않는다.)
 *         - docker를 사용해서 mysql 설치 : docker run -p 3306:3306 --name mysql_boot -e MYSQL_ROOT_PASSWORD=1 -e MYSQL_DATABASE=springboot -e MYSQL_USER=keesun -e MYSQL_PASSWORD=pass -d mysql
 *
 *      3. PostgreSQL 연동 (라이센스 비용 지불 및 소스 공개 필요 없음 - 상용화하기 좋다. )
 *         - mysql 이나 postgres사용시 둘중 하나만 의존성 추가하는 것이 좋다. (h2는 상관없음)
 *         - docker에 설치 : docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=kyun -e POSTGRES_DB=springboot --name postgres_boot -d postgres
 *
 *
 */
@SpringBootApplication
public class SpringBootStudy2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudy2Application.class, args);
	}

}
