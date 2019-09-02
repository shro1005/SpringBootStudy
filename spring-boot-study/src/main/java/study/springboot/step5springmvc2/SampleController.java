package study.springboot.step5springmvc2;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/thymelefHi")
    public String /*<- view의 이름이 된다. RestController가 아니기 때문에 응답의 본문이 아니다. */ hello(Model model) {
        model.addAttribute("name", "kyun");
        return "thymelefHi";
    }

    @GetMapping("/exception")
    /** 2019.08.30 ExceptionHandler 학습*/
    public String exception() {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
    /** 2019.08.30 ExceptionHandler 학습*/
    public @ResponseBody
    AppError handle(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.test");
        appError.setReason("just test :D");
        return appError;
    }
}
