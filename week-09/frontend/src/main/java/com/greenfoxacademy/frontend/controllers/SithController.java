package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.Sith;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SithController {

    @PostMapping("/sith")
    public ResponseEntity<Object> sith(@RequestBody Sith sith) {
        if (sith.getText() == null || sith.getText().equals("")) {
            return ResponseEntity.badRequest().body(new Error("Feed me some text you have to, padawan young you are. Hmmm."));
        } return ResponseEntity.ok().body(new Sith());
    }


}
