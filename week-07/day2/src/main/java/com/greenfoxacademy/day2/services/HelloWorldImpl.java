package com.greenfoxacademy.day2.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HelloWorldImpl implements HelloWorld {

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);

    }
}
