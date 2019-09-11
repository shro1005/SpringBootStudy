package study.springboot.step6sqldb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 2019.09.01   Spring Boot 를 활용한 SQL 연동 학습
 * <p>
 * 1. 인메모리 데이터베이스 (H2 ..)
 * URL: “testdb”
 * username: “sa”
 * password: “”    기본적으로 스프링 부트에서 세팅해준 데이터베이스
 * <p>
 * 2. MySQL 연동 (라이센스 비용 지불 필요,  소스 공개 필요 - 사용해서 잘 쓰지 않는다.)
 * - docker를 사용해서 mysql 설치 : docker run -p 3306:3306 --name mysql_boot -e MYSQL_ROOT_PASSWORD=1 -e MYSQL_DATABASE=springboot -e MYSQL_USER=keesun -e MYSQL_PASSWORD=pass -d mysql
 * <p>
 * 3. PostgreSQL 연동 (라이센스 비용 지불 및 소스 공개 필요 없음 - 상용화하기 좋다. )
 * - mysql 이나 postgres사용시 둘중 하나만 의존성 추가하는 것이 좋다. (h2는 상관없음)
 * - docker에 설치 : docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=kyun -e POSTGRES_DB=springboot --name postgres_boot -d postgres
 * <p>
 * 4. 스프링 데이터 JPA
 * - ORM (Object-Relational Mapping) : 객체와 릴레이션을 매핑할때 발생하는 개념적인 불일치 해결하는 프레임워크
 * - JPA : 이런 ORM 을 위한 자바 표준
 * - 스프링 데이터 JPA : 위의 JPA를 사용하기 아주 쉽게 구현해놓은 구현체이다. (Repository  자동 구현, 쿼리 메소드 자동 구현 등 )
 * 동작 방법 : SDJ -> JPA -> Hibernate -> Datasource 이므로 위에서 사용한 datasource의 기능 뿐 아니라 hibernate, jpa, sdj 기능까지 모두 사용가능!
 * <p>
 * 5. DB 마이그레이션 (Flyway, Liquibase)
 * -  DB 스키마 변경 or 데이터 변경을 버전 관리하듯이 sql 파일로 관리할 수 있음.
 */
@SpringBootApplication
public class SpringBootStudy2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudy2Application.class, args);
    }

}
