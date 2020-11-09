package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.controllers.GreeterController;
import com.greenfoxacademy.frontend.services.LogEntriesService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import javax.persistence.Temporal;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GreeterController.class)
public class GreeterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogEntriesService logEntriesService;

    @Test
    public void getWelcomeMessage_successful() throws Exception {
        mockMvc.perform(get("/greeter?name=Petike&title=student"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
    }

    @Test
    public void getException() throws Exception {
        mockMvc.perform(get("/greeter"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));
    }
}
