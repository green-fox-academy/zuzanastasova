package com.greenfoxacademy.messageservice.configurations;


import com.greenfoxacademy.messageservice.services.MessageService;
import com.greenfoxacademy.messageservice.services.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public MessageService messageService() {
        return new TwitterService();
    }

}
