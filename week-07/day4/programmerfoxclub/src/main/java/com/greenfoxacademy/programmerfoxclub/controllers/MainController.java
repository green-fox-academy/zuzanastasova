package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.greenfoxacademy.programmerfoxclub.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoginService loginService;
    private final FoxService foxService;

    public MainController(LoginService loginService, FoxService foxService) {
        this.loginService = loginService;
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam (required = false) String name){
        model.addAttribute("fox", loginService.getFox(name));
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String insertName(@RequestParam String name){
        loginService.addFox(name);
        return "redirect:/?name="+name;
    }

}
