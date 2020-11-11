package com.greenfoxacademy.chatproject.controllers;

import com.greenfoxacademy.chatproject.models.*;
import com.greenfoxacademy.chatproject.services.MessageService;
import com.greenfoxacademy.chatproject.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    private final UserService userService;
    private final MessageService messageService;

    public MainController(UserService userService, MessageService messageService) {
        this.userService = userService;
        this.messageService = messageService;
    }

    @GetMapping("/api/user/register")
    public String getRegisterPage(){
        return "register";
    }

    @PostMapping("/api/user/register")
    public String register(@ModelAttribute UserRequestDTO userRequestDTO, RedirectAttributes attributes){
         userService.register(userRequestDTO);
         return "redirect:/api/user/login";
    }

    @GetMapping("/api/user/login")
    public String getLoginPage(){
        return "login";
    }

    @PostMapping("/api/user/login")
    public String login(RedirectAttributes attributes, @ModelAttribute UserRequestDTO userRequestDTO, HttpSession session){
        String apiKey = userService.login(userRequestDTO);
        if (apiKey == null ){
            return "redirect:/api/user/login";
        }
        session.setAttribute("apiKey", apiKey);
        return "redirect:/api/message/";
    }

    @GetMapping("/api/user/update")
    public String getUpdatePage(){
        return "update";
    }

    @PostMapping("/api/user/update")
    public String update(@ModelAttribute UserUpdateRequestDTO userUpdateRequestDTO, HttpSession session){
        session.getAttribute("apiKey");
        userService.update(userUpdateRequestDTO);
        return "redirect:/api/message/";
    }

    @GetMapping("/api/message/")
    public String getMessagePage(Model model, @ModelAttribute GetMessageRequestDTO getMessageRequestDTO){

        model.addAttribute("messages", messageService.getMessages(getMessageRequestDTO));
        return "message";
    }

    @PostMapping("/api/message/")
    public String postMessage(@ModelAttribute PostMessageRequestDTO postMessageRequestDTO){
        messageService.postMessage(postMessageRequestDTO);
        return "redirect:/api/message/";
    }

    @PostMapping("/api/user/logout")
    public String logout(){
        if (userService.logout()){
            return "redirect:/api/user/login";
        } else
        return "redirect:/api/message/";
    }
}
