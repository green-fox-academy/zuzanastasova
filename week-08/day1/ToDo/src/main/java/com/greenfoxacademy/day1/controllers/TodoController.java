package com.greenfoxacademy.day1.controllers;

import com.greenfoxacademy.day1.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model){
        model.addAttribute("todos", todoService.findAllTodos());
        return "todolist";
    }

}