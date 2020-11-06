package com.greenfoxacademy.todowithmysql;

import com.greenfoxacademy.todowithmysql.models.Todo;
import com.greenfoxacademy.todowithmysql.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodowithmysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodowithmysqlApplication.class, args);
    }


}
