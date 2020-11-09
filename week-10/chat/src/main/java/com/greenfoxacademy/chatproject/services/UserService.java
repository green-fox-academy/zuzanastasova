package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.models.UserRequestDTO;

public interface UserService {

    public void registerHttpRequest(UserRequestDTO userRequestDTO);
    public String loginHttpRequest(UserRequestDTO userRequestDTO);

}
