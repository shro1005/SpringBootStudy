package study.springboot.step4springmvc.user;

import org.springframework.web.bind.annotation.*;

/**
 *  UserController      2019.08.28 Spring MVC 학습 (스프링 MVC를 부트를 활용해서 사용)
 *
 */
@RestController
public class UserController {

    @GetMapping("/hello")  //get 방식으로 요청을 줄때 사용
    public String hello() {
        return "hello";
    }

    /** HttpMessageConverter  : HTTP요청 본문을 객체로 변경하거나, 객체를 HTTP 응답 본문으로 변경할 때 사용
     *                          @ResponseBody , @RequestBody와 함께 사용한다. (해당 어노테이션을 사용하면 요청, 응답이 HttpMessageConverter로 들어가 전환된다)
     *                          하지만 @RestController를 사용하면 위의 어노테이션을 생력해서 사용할 수 있다.
     */
    @PostMapping("/users/create")
    public @ResponseBody User create(@RequestBody User user) {
        return user;
    }
}
