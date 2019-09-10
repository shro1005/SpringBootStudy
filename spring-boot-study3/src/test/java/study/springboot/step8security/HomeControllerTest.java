package study.springboot.step8security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    @WithMockUser  // 가짜 인증 정보를 줘서 securtiy test를 성공하돌고 함.
    public void welcome() throws Exception {
        mockMvc.perform(get("/welcome")
                    .accept(MediaType.TEXT_HTML))      /**스프링부트가 제공하는 spring security는 기본적으로 베이직 인증(응답의 형태를 인증)하기 때문에 해당 절차가 필요하다.*/
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"));
    }

    @Test
    @WithMockUser
    public void my() throws Exception {
        mockMvc.perform(get("/my")
                    .accept(MediaType.TEXT_HTML))       /**없으면 테스트시 베이직인증 에러 발생 */
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("my"));
    }

}
