package com.greenfoxacademy.workshop.Services;

import com.greenfoxacademy.workshop.Models.DTOs.RegisterDTO;
import com.greenfoxacademy.workshop.Models.MyUser;
import org.springframework.http.ResponseEntity;

public interface MyUserService {

    MyUser findMyUserByUsername(String username);
    ResponseEntity<Object> registerUser(RegisterDTO registerDTO);

}
