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
        ResponseEntity<UserRegisterResponseDTO> responseUser;
        try {
            responseUser = restTemplate
                    .exchange("https://sage-chat.herokuapp.com/api/user/register", HttpMethod.POST, requestUser, UserRegisterResponseDTO.class);
        }catch (Exception e){
            responseUser = new ResponseEntity<>(new UserRegisterResponseDTO(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        UserRegisterResponseDTO responseBody = responseUser.getBody();
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

    public void update(UserUpdateRequestDTO userUpdateRequestDTO){

        HttpHeaders headers = new HttpHeaders();
        headers.set("apiKey", apiKey);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<UserUpdateRequestDTO> requestUser = new HttpEntity<>(userUpdateRequestDTO, headers);
        ResponseEntity<UserUpdateResponseDTO> responseUser;
        try {
            responseUser = restTemplate
                    .exchange("https://sage-chat.herokuapp.com/api/user/update", HttpMethod.POST, requestUser, UserUpdateResponseDTO.class);
        } catch (Exception e) {
            responseUser = new ResponseEntity<>(new UserUpdateResponseDTO(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        UserUpdateResponseDTO responseBody = responseUser.getBody();
    }

    public String getApiKey(){
        return apiKey;
    }

    public Boolean logout(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("apiKey", apiKey);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestUser = new HttpEntity<>(headers);
        ResponseEntity<Boolean> responseUser;
        try {
            responseUser = restTemplate
                    .exchange("https://sage-chat.herokuapp.com/api/user/logout", HttpMethod.POST, requestUser, Boolean.class);
            apiKey = "";
            return responseUser.getBody();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
