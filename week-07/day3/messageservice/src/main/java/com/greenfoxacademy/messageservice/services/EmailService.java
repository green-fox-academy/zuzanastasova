package com.greenfoxacademy.messageservice.services;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{

    @Override
    public void processMessage(String message, String email) {
        System.out.println("Email Sent to " + email + " with Message=" + message);
    }

}
