package study.springboot.step6sqldb.account;

import javax.persistence.*;
import java.util.Objects;

/**
 * 2019.09.03  Spirng Data JPA 학습을 위한 Entity 추가
 */
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /** 값 자동 부여*/
    private Long id;

    private String username;

    private String password;

    private Boolean active;

    /**
     * 2019.09.05 데이터베이스 마이그레이션 테스트를 위한 신규 칼럼 추가 및 데이터 추가
     */

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Objects.equals(username, account.username) &&
                Objects.equals(password, account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
