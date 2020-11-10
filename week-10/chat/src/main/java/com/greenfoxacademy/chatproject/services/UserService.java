package com.greenfoxacademy.chatproject.services;

import com.greenfoxacademy.chatproject.models.UpdateRequestDTO;
import com.greenfoxacademy.chatproject.models.UserRequestDTO;

public interface UserService {

    public void register(UserRequestDTO userRequestDTO);
    public String login(UserRequestDTO userRequestDTO);
    public void update(UpdateRequestDTO updateRequestDTO);
    public Boolean logout();

}
