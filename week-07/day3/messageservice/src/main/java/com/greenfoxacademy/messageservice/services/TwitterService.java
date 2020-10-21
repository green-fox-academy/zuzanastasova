package com.greenfoxacademy.messageservice.services;

import org.springframework.stereotype.Service;

public class TwitterService implements MessageService{

    @Override
    public void processMessage(String message, String recipient) {
        System.out.println("Twitter message sent to " + recipient + " with Message=" + message);
    }

}
