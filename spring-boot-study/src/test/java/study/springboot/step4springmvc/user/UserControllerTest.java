package study.springboot.step4springmvc.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));
    }

    @Test
    public void createUser_JSON() throws Exception {
        String userJSON = "{\"username\":\"kyun\",\"password\":\"1234\"}";
        mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON_UTF8)   /** content : 요청 JSON*/
                .accept(MediaType.APPLICATION_JSON_UTF8)        /** accept  : 응답 JSON*/
                .content(userJSON))             /** 여기까지는 요청 만드는 법*/
                .andExpect(status().isOk())         /** 여기서부터 검증*/
                .andExpect(jsonPath("$.username", is(equalTo("kyun"))))
                .andExpect(jsonPath("$.password", is(equalTo("1234"))));
    }

    @Test
    public void createUser_XML() throws Exception {    /** 2019.08.29. View Resolver 학습 */
        String userJSON = "{\"username\":\"kyun\",\"password\":\"1234\"}";
        mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON_UTF8)   /** content : 요청 JSON*/
                .accept(MediaType.APPLICATION_XML)        /** accept  ; 응답 XML*/
                .content(userJSON))             /** 여기까지는 요청 만드는 법*/
                .andExpect(status().isOk())         /** 여기서부터 검증*/
                .andExpect(xpath("User/username").string("kyun"))
                .andExpect(xpath("User/password").string("1234"));
    }

}
