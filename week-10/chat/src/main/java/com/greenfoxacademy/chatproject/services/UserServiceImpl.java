package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.models.User;
import com.greenfoxacademy.chatproject.models.UserLoginResponseDTO;
import com.greenfoxacademy.chatproject.models.UserRequestDTO;
import com.greenfoxacademy.chatproject.models.UserResponseDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    private User user;
    private List<User> users;
    public static String apiKey;

    public void registerHttpRequest(UserRequestDTO userRequestDTO){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<UserRequestDTO> requestUser = new HttpEntity<>(userRequestDTO);
        ResponseEntity<UserResponseDTO> responseUser = restTemplate
                .exchange("https://sage-chat.herokuapp.com/api/user/register", HttpMethod.POST, requestUser, UserResponseDTO.class);
        UserResponseDTO responseBody = responseUser.getBody();
    }

    public String loginHttpRequest(UserRequestDTO userRequestDTO){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<UserRequestDTO> requestUser = new HttpEntity<>(userRequestDTO);
        ResponseEntity<UserLoginResponseDTO> responseUser = restTemplate
                .exchange("https://sage-chat.herokuapp.com/api/user/register", HttpMethod.POST, requestUser, UserLoginResponseDTO.class);
        UserLoginResponseDTO responseBody = responseUser.getBody();
        assert responseBody != null;
        if (responseBody.getApiKey() != null) {
            apiKey = responseUser.getBody().getApiKey();
            return apiKey;
        } else
            return null;
    }

    public void update(UserRequestDTO userRequestDTO){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<UserRequestDTO> requestUser = new HttpEntity<>(userRequestDTO);
        requestUser.getHeaders().add("apiKey", apiKey);
    }
}
