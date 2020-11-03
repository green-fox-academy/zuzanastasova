package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Appenda;
import com.greenfoxacademy.frontend.models.DoUntil;
import com.greenfoxacademy.frontend.models.Doubling;
import com.greenfoxacademy.frontend.models.Greeter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/doubling")
    public Doubling doubling(@RequestParam (required = false) Integer input){
        if (input != null) {
            return new Doubling(input);
        } else
            return new Doubling();
    }

    @ResponseBody
    @GetMapping ("/greeter")
    public ResponseEntity<Greeter> greeter(@RequestParam (required = false) String name, @RequestParam (required = false) String title){
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
        if (appendable == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "word not found");
        }
        return ResponseEntity.ok().body(new Appenda(appendable));
    }

    @ResponseBody
    @PostMapping("/dountil/{action}")
    public ResponseEntity<DoUntil> doUntil(@PathVariable String action, @RequestBody DoUntil doUntil){
        if (doUntil.getUntil() == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "number not found");
        } else
            doUntil.calculate(action);
        return ResponseEntity.ok().body(doUntil);
    }

}
