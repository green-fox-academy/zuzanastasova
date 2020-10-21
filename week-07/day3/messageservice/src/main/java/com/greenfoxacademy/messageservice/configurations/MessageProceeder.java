package com.greenfoxacademy.messageservice.configurations;

import com.greenfoxacademy.messageservice.services.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

    private MessageService messageService;

    public MessageProceeder(MessageService messageService) {
        this.messageService = messageService;
    }

    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient){
        messageService.processMessage(message, recipient);
    }

}
