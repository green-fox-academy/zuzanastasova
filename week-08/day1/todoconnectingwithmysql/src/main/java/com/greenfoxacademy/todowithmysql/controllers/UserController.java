package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.models.User;
import com.greenfoxacademy.todowithmysql.services.TodoService;
import com.greenfoxacademy.todowithmysql.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    private final TodoService todoService;
    private final UserService userService;

    @Autowired
    public UserController(TodoService todoService, UserService userService) {
        this.todoService = todoService;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPage(@RequestParam String userName, @RequestParam String password) {

        var user = userService.loginUser(userName, password);
        if (user == null) {
            return "redirect:/login";
        }
        return "redirect:/todo" + userName;
    }

    @GetMapping("/register")
    public String validatePassword() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        userService.registerUser(user);
        return "redirect:/login";
    }

    @PostMapping("/logout/{userName}")
    public String userLogout(@PathVariable String userName) {
        userService.userLogout(userName);
        return "redirect:/login";
    }
}

