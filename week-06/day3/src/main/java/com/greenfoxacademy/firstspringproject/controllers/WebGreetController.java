package com.greenfoxacademy.firstspringproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetController {

    AtomicLong greetCount = new AtomicLong();

    @RequestMapping("/web/greetingcount")
    public String greetingCount(Model model, String name) {
        model.addAttribute("name", name);
        model.addAttribute("greetCount", greetCount.incrementAndGet());
        return "greetingcount";
    }

}
