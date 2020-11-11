package com.greenfoxacademy.chatproject.models;

import java.util.ArrayList;
import java.util.List;

public class GetMessageResponseDTO {

    List<PostMessageResponseDTO> messages;
    private Channel channel;

    public GetMessageResponseDTO() {
        messages = new ArrayList<>();
    }

    public GetMessageResponseDTO(List<PostMessageResponseDTO> messages, Channel channel) {
        this.messages = messages;
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public List<PostMessageResponseDTO> getMessages() {
        return messages;
    }

    public void setMessages(List<PostMessageResponseDTO> messages) {
        this.messages = messages;
    }
}
