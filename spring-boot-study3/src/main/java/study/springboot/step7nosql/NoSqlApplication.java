package study.springboot.step7nosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot를 활용하여 데이터베이스 연동하기 - NoSql 편
 * <p>
 * 1. Redis
 * 도커에 설치 : docker run -p 6379:6379 --name redis_boot -d redis
 * 도커에서 실행 : docker exec -i -t redis_boot redis-cli
 * - 캐시, 메세지 브로커, 키/벨류 스로어 등으로 사용가능
 * <p>
 * 2. MongoDB  : JSON 기반의 도큐먼트 데이터베이스 , 스키마가 없는것이 특징
 * 도커에 설치 : docker run -p 27017:27017 --name mongo_boot -d mongo
 * 도커에서 실행 : docker exec -i -t mongo_boot bash
 * <p>
 * 3. Neo4j : 노드간의 연관 관계를 영속화하는데 유리한 그래프 데이터베이스
 * <p>
 * =========================================================================
 */
@SpringBootApplication
public class NoSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoSqlApplication.class, args);
    }

}
