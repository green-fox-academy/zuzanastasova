package com.greenfoxacademy.day1;

import com.greenfoxacademy.day1.models.Todo;
import com.greenfoxacademy.day1.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day1Application implements CommandLineRunner {

    private final TodoRepository todoRepository;

    public Day1Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Day1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("I have to learn ORM"));
        todoRepository.save(new Todo("I have to learn Java"));
    }
}
