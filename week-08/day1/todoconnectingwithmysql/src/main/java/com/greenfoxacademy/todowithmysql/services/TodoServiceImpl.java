package com.greenfoxacademy.todowithmysql.services;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService{

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void addTodo(Todo todo){
        if (todo.getId() == null) {
        todoRepository.save(todo);
        }
    }

    public List<Todo> findAllTodos(){
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    public void deleteById(Long id){
        todoRepository.deleteById(id);
    }

    public Optional<Todo> findById(Long id){
        return todoRepository.findById(id);
    }

    public List<Todo> searchByTitle(String title) {
        return todoRepository.findAllByTitleContainingIgnoreCase(title);
    }

}

