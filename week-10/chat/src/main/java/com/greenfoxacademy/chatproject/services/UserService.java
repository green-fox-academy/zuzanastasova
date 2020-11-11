package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.models.UserUpdateRequestDTO;
import com.greenfoxacademy.chatproject.models.UserRequestDTO;

public interface UserService {

    public void register(UserRequestDTO userRequestDTO);
    public String login(UserRequestDTO userRequestDTO);
    public void update(UserUpdateRequestDTO userUpdateRequestDTO);
    public String getApiKey();
    public Boolean logout();
}
