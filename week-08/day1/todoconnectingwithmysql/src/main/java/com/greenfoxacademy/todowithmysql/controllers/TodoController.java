package com.greenfoxacademy.todowithmysql.controllers;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.services.AssigneeService;
import com.greenfoxacademy.todowithmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TodoController {

    private final TodoService todoService;
    private final AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping({"/todo/{userName}", "/{userName}", "/", "/todo"})
    public String list(Model model, @PathVariable(required = false) String userName){
        model.addAttribute("todos", todoService.findAllTodosSortedByUrgency());
        return "todolist";
    }

    @GetMapping("/todo/active")
    public String listActive(Model model){
        model.addAttribute("todos", todoService.findAllTodosSortedByUrgency());
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
    public String getEditForm(Model model, @PathVariable Long id) {
        Optional<Todo> todo = todoService.findById(id);
        if(todo.isPresent()) {
            model.addAttribute("todo", todo.get());
            model.addAttribute("assignees", assigneeService.findAllAssignees());
            return "edit";
        }
        return "redirect:/todo";
    }

    @PostMapping("/todo/{id}/edit")
    public String editTodo(@PathVariable Long id,
                           @ModelAttribute("title") String title,
                           @ModelAttribute("urgent") String urgent,
                           @ModelAttribute("done") String done) {
        boolean urgentBoolean = (urgent.equals("true"))? true: false;
        boolean doneBoolean = (done.equals("true"))? true: false;
        todoService.addTodo(new Todo(id, title, urgentBoolean, doneBoolean));
        return "redirect:/todo";
    }

    @GetMapping("/todo/search-by-title/")
    public String searchByTitle(Model model, @RequestParam (required = false) String title){
            model.addAttribute("todos", todoService.searchByTitle(title));
        return "todolist";
    }
}
