package com.greenfoxacademy.day1.services;

import com.greenfoxacademy.day1.models.Todo;

import java.util.List;

public interface TodoService {

    public void addTodo(Todo todo);
    public List<Todo> findAllTodos();

}
