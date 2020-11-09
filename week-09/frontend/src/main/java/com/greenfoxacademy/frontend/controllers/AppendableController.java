package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Appenda;
import com.greenfoxacademy.frontend.models.LogEntries;
import com.greenfoxacademy.frontend.services.LogEntriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class AppendableController {

    private final LogEntriesService logEntriesService;

    public AppendableController(LogEntriesService logEntriesService) {
        this.logEntriesService = logEntriesService;
    }

    @ResponseBody
    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<Appenda> appendA(@PathVariable String appendable){
        logEntriesService.saveLog(new LogEntries("/appenda/"+ appendable, "appendable: " + appendable));
        if (appendable == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "word not found");
        }
        return ResponseEntity.ok().body(new Appenda(appendable));
    }
}
