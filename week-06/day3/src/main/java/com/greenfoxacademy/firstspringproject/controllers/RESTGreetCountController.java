package com.greenfoxacademy.firstspringproject.controllers;

import com.greenfoxacademy.firstspringproject.models.GreetCount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
    public class RESTGreetCountController {

        private final AtomicLong greetCount = new AtomicLong();

        @RequestMapping(value = "/usergreetingcount")
        public GreetCount greetCountMethod(@RequestParam String name){
            return new GreetCount(greetCount.incrementAndGet(), "Hello, " + name + "!");
        }

    }