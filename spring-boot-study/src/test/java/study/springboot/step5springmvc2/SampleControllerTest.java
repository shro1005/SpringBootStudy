package study.springboot.step5springmvc2;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

//import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    WebClient webClient;

    /**
     * 2019.08.30 htmlUnit 활용할때는 WebClient를 사용한다.
     */

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/thymelefHi"))      /** 요청 : /thymelefHi */
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(view().name("thymelefHi"))
                .andExpect(model().attribute("name", is("kyun")));  /** 응답 : 모델 -> name : kyun / view -> 이름 : hello */

        HtmlPage page = webClient.getPage("/thymelefHi");  // Page 말고 HtmlPage로 바꿔주면 더 다양한 테스트를 할 수 있다.
        HtmlHeading1 h1 = page.getFirstByXPath("//h1");
        assertThat(h1.getTextContent()).isEqualToIgnoringCase("kyun");
    }

}
