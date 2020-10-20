package com.greenfoxacademy.day2;

import com.greenfoxacademy.day2.services.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day2Application implements CommandLineRunner {

    private final HelloWorld helloWorld;

    @Autowired
    public Day2Application(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public static void main(String[] args) {
        SpringApplication.run(Day2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        helloWorld.log("hello");
    }
}
