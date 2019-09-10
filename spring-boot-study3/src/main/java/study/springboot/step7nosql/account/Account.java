package study.springboot.step7nosql.account;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("accounts")  /** 2019.09.05 Redis에서는 hash, list에 데이터를 저장할 수 있다. hash의 경우 키 / 벨류를 통해 데이터를 넣고 확인가능하다. */
public class Account {

    @Id
    private String id;

    private String email;

    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
