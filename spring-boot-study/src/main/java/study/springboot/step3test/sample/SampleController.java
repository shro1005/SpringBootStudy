package study.springboot.step3test.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController    2019.08.27 Test 학습을 위한 Controller
 */
@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping
    public String hello() {
        return "hello " + sampleService.getName();
    }
}
