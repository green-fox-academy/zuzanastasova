package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Todo;

import java.util.List;
import java.util.Optional;


public interface TodoService {

    public void addTodo(Todo todo);
    public List<Todo> findAllTodos();
    void deleteById(Long id);
    Optional<Todo> findById(Long id);
    public List<Todo> searchByTitle(String title);

}
