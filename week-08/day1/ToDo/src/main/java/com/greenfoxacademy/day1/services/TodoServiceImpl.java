package com.greenfoxacademy.day1.services;

import com.greenfoxacademy.day1.models.Todo;
import com.greenfoxacademy.day1.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void addTodo(Todo todo){
        todoRepository.save(todo);
    }

    public List<Todo> findAllTodos(){
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }
}
