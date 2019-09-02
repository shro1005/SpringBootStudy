package study.springboot.step3test.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * SampleControllerTest        2019.08.27  Test 학습 (Mock, TestRestTemplate, WebTestClient 헉습)
 */
@RunWith(SpringRunner.class)
/** 가장 기본적인 형태의 Sptring Boot Test 형식*/
/** 1. Mock 사용해서 내장톰캣 띄우지 않고 테스트하는 방법 */
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)   /** 기본적으로 Mock으로 테스트하는 것이 가장 빠르고 쉬움 */
/**  Mock : Servlet Container(톰캣 등)를 띄우지 않고
 *          mock up을 해서 디스패처 서블릿에 요청을 보내는 테스트를 진행할 수 있다.
 *          즉, 내장 톰캣을 사용하지 않고 요청을 주고 받는 것을 테스트 해볼 수 있다.
 */
/** 2. 내장톰캣을 띄워서 테스트 하는 방법 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
/** 내장 톰캣을 랜덤포트로 띄워서 테스트 할 수 있다. */
@AutoConfigureMockMvc
public class SampleControllerTest {

    @Autowired
//    MockMvc mockMvc;   /** Mock사용시 */
//    TestRestTemplate testRestTemplate;  /** 내장 톰캣 사용시, test용 RestTemplate이다.
//                                            testRestTemplate은 synchronous : 요청하나 보내고 끝날때 까지 기다린 다음 요청을 보낼 수 있다. */
            WebTestClient webTestClient;   /** asynchronous 하기 때문에 많이 사용!!!! */


    /**
     * 2.1 Servlet단 까지만 테스트하고 싶을 때 -> 테스트가 서비스까지 즉, 무거운 테스트를 피하기 위함
     */
    @MockBean  // Service를 MockBean으로 대체하면 테스트할때 Mock Bean의 서비스가 적용된다.
            SampleService mockSampleService;

    @Test
    public void hello() throws Exception {
        /** 1. Mock 사용시 */
//        mockMvc.perform(get("/hello"))   /** get방식으로 요청 보낸다는 의미 */
//                .andExpect(status().isOk())         /** return이 200인지 확인 */
//                .andExpect(content().string("hello kyun"))   /** 내용이 맞는지 확인*/
//                .andDo(print());                    /** 요청왔던 것을 출력 */

        /** 2. 내장 톰캣 사용시 */
        /** 2.1 Service를 Mock Bean 으로 대체 시*/
        when(mockSampleService.getName()).thenReturn("Adwin");
        /** TestRestTemplate 사용*/
//        String result = testRestTemplate.getForObject("/hello", String.class);  /** url과 원하는 body type을 적어주면 결과값을 받을 수 있다.*/
//        assertThat(result).isEqualTo("hello kyun");    // 내장 톰켓만 사용했을 경우
//        assertThat(result).isEqualTo("hello Adwin");    // Mock Bean 사용시
        /** WebTestClient 사용*/
        webTestClient.get().uri("/hello").exchange().expectStatus().isOk()
                .expectBody(String.class).isEqualTo("hello Adwin");

    }
}
