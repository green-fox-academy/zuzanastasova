package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.models.*;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    public static String apiKey;

    public void register(UserRequestDTO userRequestDTO){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<UserRequestDTO> requestUser = new HttpEntity<>(userRequestDTO);
        ResponseEntity<UserResponseDTO> responseUser = restTemplate
                .exchange("https://sage-chat.herokuapp.com/api/user/register", HttpMethod.POST, requestUser, UserResponseDTO.class);
        UserResponseDTO responseBody = responseUser.getBody();
    }

    public String login(UserRequestDTO userRequestDTO){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<UserRequestDTO> requestUser = new HttpEntity<>(userRequestDTO);
        ResponseEntity<UserLoginResponseDTO> responseUser;
        try {
            responseUser = restTemplate
                    .exchange("https://sage-chat.herokuapp.com/api/user/login", HttpMethod.POST, requestUser, UserLoginResponseDTO.class);
        } catch (Exception e){
            responseUser = new ResponseEntity<>(new UserLoginResponseDTO(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        UserLoginResponseDTO responseBody = responseUser.getBody();
        if (responseBody.getApiKey() != null) {
            apiKey = responseUser.getBody().getApiKey();
            return apiKey;
        } else
            return null;
    }

    public void update(UpdateRequestDTO updateRequestDTO){

        HttpHeaders headers = new HttpHeaders();
        headers.set("apiKey", apiKey);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<UpdateRequestDTO> requestUser = new HttpEntity<>(updateRequestDTO, headers);
        ResponseEntity<UpdateResponseDTO> responseUser;
        try {
            responseUser = restTemplate
                    .exchange("https://sage-chat.herokuapp.com/api/user/update", HttpMethod.POST, requestUser, UpdateResponseDTO.class);
        } catch (Exception e) {
            responseUser = new ResponseEntity<>(new UpdateResponseDTO(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        UpdateResponseDTO responseBody = responseUser.getBody();
    }

    public Boolean logout(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("apiKey", apiKey);
        HttpEntity request = new HttpEntity<>(headers);
        ResponseEntity<Boolean> response;
        try {
            response = restTemplate.exchange("https://sage-chat.herokuapp.com/api/user/logout", HttpMethod.POST, request, Boolean.class);
        } catch (Exception e){
            response = new ResponseEntity<>(Boolean.FALSE, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        Boolean responseBody = response.getBody();
        if (responseBody){
            apiKey = "";
        }
        return responseBody;
    }
}
