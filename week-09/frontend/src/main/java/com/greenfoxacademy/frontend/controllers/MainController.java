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

    @ResponseBody
    @GetMapping("/doubling")
    public Doubling doubling(@RequestParam (required = false) Integer input){
        logEntriesService.saveLog(new LogEntries("/doubling", "received: " + input));
        if (input != null) {
            return new Doubling(input);
        } else
            return new Doubling();
    }

    @ResponseBody
    @GetMapping ("/greeter")
    public ResponseEntity<Greeter> greeter(@RequestParam (required = false) String name, @RequestParam (required = false) String title){
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

    @ResponseBody
    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<Appenda> appendA(@PathVariable String appendable){
        logEntriesService.saveLog(new LogEntries("/appenda/"+ appendable, "appendable: " + appendable));
        if (appendable == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "word not found");
        }
        return ResponseEntity.ok().body(new Appenda(appendable));
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

    @ResponseBody
    @GetMapping("/log")
    public LogEntriesDTO logEntries(){
        List<LogEntries> entries = logEntriesService.findAllLogs();
        int entry_count = logEntriesService.findAllLogs().size();
        return new LogEntriesDTO(entries, entry_count);
    }
}
