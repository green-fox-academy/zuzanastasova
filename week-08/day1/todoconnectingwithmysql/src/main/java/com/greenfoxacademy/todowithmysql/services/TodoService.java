package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Todo;

import java.util.List;


public interface TodoService {

    public void addTodo(Todo todo);
    public List<Todo> findAllTodos();

}
