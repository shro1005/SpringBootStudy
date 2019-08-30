package study.springboot.step5springmvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/thymelefHi")
    public String /*<- view의 이름이 된다. RestController가 아니기 때문에 응답의 본문이 아니다. */ hello(Model model) {
        model.addAttribute("name", "kyun");
        return "thymelefHi";
    }
}
