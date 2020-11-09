package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.DoUntil;
import com.greenfoxacademy.frontend.models.LogEntries;
import com.greenfoxacademy.frontend.services.LogEntriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoUntilController {

    private final LogEntriesService logEntriesService;

    public DoUntilController(LogEntriesService logEntriesService) {
        this.logEntriesService = logEntriesService;
    }

    @ResponseBody
    @PostMapping("/dountil/{action}")
    public ResponseEntity<DoUntil> doUntil(@PathVariable String action, @RequestBody DoUntil doUntil){
        logEntriesService.saveLog(new LogEntries("/dountil/" + action, "until: " + doUntil.getUntil()));
        if (doUntil.getUntil() == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "number not found");
        } else
            doUntil.calculate(action);
        return ResponseEntity.ok().body(doUntil);
    }
}
