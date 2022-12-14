package com.example.dashboarda.controller;

import com.example.dashboarda.dto.requestDto.UserJoinReqDto;
import com.example.dashboarda.model.User;
import com.example.dashboarda.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private UserService userService;

    @Test
    public void 회원가입_join() throws Exception{
        String userName = "userName";
        String password = "password";

        // TODO: mocking
        when(userService.join(userName, password)).thenReturn(mock(User.class));  // 정상적으로 동작하는 경우 User클래스 반환

        mockMvc.perform(post("/api/users/join")  // 해당 url로 post 요청한다.
                        .contentType(MediaType.APPLICATION_JSON)
                        // todo : add request body
                        .content(objectMapper.writeValueAsBytes(new UserJoinReqDto(userName, password)))
                ).andDo(print())
                .andExpect(status().isOk());   // status가 정상으로 되기를 기대한다.
    }
}
