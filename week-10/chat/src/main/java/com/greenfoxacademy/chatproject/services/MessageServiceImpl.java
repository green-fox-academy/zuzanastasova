package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.models.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    private final UserService userService;

    public MessageServiceImpl(UserService userService) {
        this.userService = userService;
    }


    public PostMessageResponseDTO postMessage(PostMessageRequestDTO postMessageRequestDTO){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("apiKey", userService.getApiKey());
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<PostMessageRequestDTO> requestMessage = new HttpEntity<>(postMessageRequestDTO, httpHeaders);
        ResponseEntity<PostMessageResponseDTO> responseMessage;
        try {
            responseMessage = restTemplate
                    .exchange("https://sage-chat.herokuapp.com/api/message/", HttpMethod.POST, requestMessage, PostMessageResponseDTO.class);
             return responseMessage.getBody();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<PostMessageResponseDTO> getMessages(GetMessageRequestDTO getMessageRequestDTO) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("apiKey", userService.getApiKey());
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<GetMessageRequestDTO> requestMessage = new HttpEntity<>(getMessageRequestDTO, httpHeaders);
        ResponseEntity<GetMessageResponseDTO> responseMessage;
        try {
            responseMessage = restTemplate
                    .exchange("https://sage-chat.herokuapp.com/api/channel/get-messages", HttpMethod.POST, requestMessage, GetMessageResponseDTO.class);
            return responseMessage.getBody().getMessages();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
