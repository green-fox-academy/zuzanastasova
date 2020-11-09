package com.greenfoxacademy.chatproject.controllers;

import com.greenfoxacademy.chatproject.models.UserRequestDTO;
import com.greenfoxacademy.chatproject.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserRequestDTO userRequestDTO){
        userService.registerHttpRequest(userRequestDTO);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UserRequestDTO userRequestDTO){
        userService.loginHttpRequest(userRequestDTO);
        return "redirect:/login";
    }

    @PostMapping("/update")
    public String update(){
        return "update";
    }

}
