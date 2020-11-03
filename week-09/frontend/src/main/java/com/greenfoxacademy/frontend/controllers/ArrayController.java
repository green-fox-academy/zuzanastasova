package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Array;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.greenfoxacademy.frontend.models.Error;

@RestController
public class ArrayController {

    @PostMapping("/arrays")
    public ResponseEntity<Object> arraysHandler(@RequestBody (required = false) Array numbers){

        if (numbers.getWhat() == null && numbers.getNumbers() == null) {
            return ResponseEntity.badRequest().body(new Error("Please provide what to do with the numbers and numbers themselves!"));
        }

        if(numbers.getWhat() == null){
            return ResponseEntity.badRequest().body(new Error("Please provide what to do with the numbers!"));
        }

        if(numbers.getNumbers() == null){
            return ResponseEntity.badRequest().body(new Error("Please provide the numbers!"));
        }

        switch (numbers.getWhat()) {
            case "sum":
                numbers.sum();
                break;
            case "multiply":
                numbers.multiply();
                break;
            case "double":
                numbers.doubled();
                break;
        }
        return ResponseEntity.ok().body(numbers);
    }

}
