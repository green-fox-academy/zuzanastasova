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
public class DoublingController {

    private final LogEntriesService logEntriesService;

    public DoublingController(LogEntriesService logEntriesService) {
        this.logEntriesService = logEntriesService;
    }

    @ResponseBody
    @GetMapping("/doubling")
    public Doubling doubling(@RequestParam(required = false) Integer input) {
        logEntriesService.saveLog(new LogEntries("/doubling", "received: " + input));
        if (input != null) {
            return new Doubling(input);
        } else
            return new Doubling();
    }
}