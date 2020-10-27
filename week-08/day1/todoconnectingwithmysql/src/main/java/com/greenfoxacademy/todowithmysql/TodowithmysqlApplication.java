package com.greenfoxacademy.todowithmysql;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodowithmysqlApplication implements CommandLineRunner {

    private final TodoRepository todoRepository;

    public TodowithmysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodowithmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
