package com.greenfoxacademy.firstspringproject.controllers;

import com.greenfoxacademy.firstspringproject.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloNameRESTController {

    @RequestMapping(value = "/usergreeting")
    public Greeting greeting(@RequestParam String name){
        return new Greeting(1, "Hello, " + name + "!");
    }

}