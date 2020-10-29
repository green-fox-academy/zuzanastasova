package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/todo/{id}/delete")
    public String deleteItem(@PathVariable Long id) {
        //delete item by id
        todoService.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping("/todo/{id}/edit")
    public String editTodoByIdPage(@PathVariable long id, Model model) {
        Optional<Todo> todo = todoService.findById(id);
        if (todo.isPresent()) {
            model.addAttribute("todo", todo.get());
            return "edit";
        }
        return "redirect:/todo";
    }

    @PostMapping("/todo/edit")
    public String editTodoById(@ModelAttribute Todo todo) {
        todoService.addTodo(todo);
        return "redirect:/todo";
    }

    @GetMapping("/todo/search-by-title/")
    public String searchByTitle(Model model, @RequestParam (required = false) String title){
            model.addAttribute("todos", todoService.searchByTitle(title));
        return "todolist";
    }
}
