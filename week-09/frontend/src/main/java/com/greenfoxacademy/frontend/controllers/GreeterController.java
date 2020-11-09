package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Greeter;
import com.greenfoxacademy.frontend.models.LogEntries;
import com.greenfoxacademy.frontend.services.LogEntriesService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreeterController {

    private final LogEntriesService logEntriesService;

    public GreeterController(LogEntriesService logEntriesService) {
        this.logEntriesService = logEntriesService;
    }

    @ResponseBody
    @GetMapping("/greeter")
    public ResponseEntity<Greeter> greeter(@RequestParam(required = false) String name, @RequestParam (required = false) String title){
        logEntriesService.saveLog(new LogEntries("/greeter", "name: " + name + ", title: " + title));
        if (title == null && name == null){
            return ResponseEntity.badRequest().body(new Greeter("Please provide a name and a title!"));
        } else if (title == null){
            return ResponseEntity.badRequest().body(new Greeter("Please provide a title!"));
        } else if (name == null){
            return ResponseEntity.badRequest().body(new Greeter("Please provide a name!"));
        } else
            return ResponseEntity.ok().body(new Greeter(name, title));
    }

}
