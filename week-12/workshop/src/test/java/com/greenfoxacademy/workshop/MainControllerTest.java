package com.greenfoxacademy.workshop;

import com.greenfoxacademy.workshop.Services.MyUserService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableWebMvc
public class MainControllerTest {

    @Autowired
    WebApplicationContext context;

    MockMvc mockMvc;

    @Autowired
    MyUserService  myUserService;

    @BeforeEach
    public void doBefore() throws Exception {
        String jwt = "";

        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(springSecurity())
                .build();

        mockMvc.perform(post("/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"registerUserName\" : \"foo\", \"registerPassword\" : \"foo\"}"))
                .andExpect(status().isOk());

        MvcResult result = mockMvc.perform(post("/authenticate")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"username\" : \"foo\", \"password\" : \"foo\"}"))
                .andExpect(status().isOk()).andReturn();

        jwt = result.getResponse().getContentAsString();
        System.out.println(jwt);
    }

    @Test
    void authenticateUserTestCase(){
        Assert.assertEquals(1, 1);
    }
}
