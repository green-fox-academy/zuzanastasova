package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.models.*;

import java.util.List;

public interface MessageService {

    PostMessageResponseDTO postMessage(PostMessageRequestDTO postMessageRequestDTO);
    List<PostMessageResponseDTO> getMessages(GetMessageRequestDTO getMessageRequestDTO);

}
