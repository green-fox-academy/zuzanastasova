package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import com.greenfoxacademy.frontend.services.LogEntriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
public class MainController {

    private final LogEntriesService logEntriesService;

    public MainController(LogEntriesService logEntriesService) {
        this.logEntriesService = logEntriesService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
