package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    public String list(Model model){
        model.addAttribute("todos", todoService.findAllTodos());
        return "todolist";
    }

    @GetMapping("/todo/active")
    public String listActive(Model model){
        model.addAttribute("todos", todoService.findAllTodos());
        return "activeTodoList";
    }

    @GetMapping("/todo/add")
    public String insertTodo(){
        return "addTodo";
    }

    @PostMapping("/todo/add")
    public String addTodo(@ModelAttribute Todo todo){
        todoService.addTodo(todo);
        return "redirect:/todo";
    }


}
