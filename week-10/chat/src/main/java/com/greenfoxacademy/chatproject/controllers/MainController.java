package com.greenfoxacademy.chatproject.controllers;

import com.greenfoxacademy.chatproject.models.UpdateRequestDTO;
import com.greenfoxacademy.chatproject.models.UserRequestDTO;
import com.greenfoxacademy.chatproject.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/user/register")
    public String getRegisterPage(){
        return "register";
    }

    @PostMapping("/api/user/register")
    public String register(@ModelAttribute UserRequestDTO userRequestDTO){
        userService.register(userRequestDTO);
        return "redirect:/api/user/login";
    }

    @GetMapping("/api/user/login")
    public String getLoginPage(){
        return "login";
    }

    @PostMapping("/api/user/login")
    public String login(RedirectAttributes attributes, @ModelAttribute UserRequestDTO userRequestDTO){
        if(userService.login(userRequestDTO) == null) {
            attributes.addFlashAttribute("isLoginSuccessful", false);
            return "redirect:/api/user/login";
        } else
            attributes.addFlashAttribute("isLoginSuccessful", true);
            attributes.addFlashAttribute("apiKey",userService.login(userRequestDTO));
        return "redirect:/api/user/update";
    }

    @GetMapping("/api/user/update")
    public String getUpdatePage(){
        return "update";
    }

    @PostMapping("/api/user/update")
    public String update(@ModelAttribute UpdateRequestDTO updateRequestDTO){
        userService.update(updateRequestDTO);
        return "redirect:/api/message/";
    }

    @GetMapping("/api/message/")
    public String getMessagePage(){
        return "message";
    }

    @PostMapping("/api/user/logout")
    public String logout(SessionStatus status){

        if(userService.logout()) {
            return "redirect:/api/user/login";
        } else
            return "redirect:/api/message";
    }
}
