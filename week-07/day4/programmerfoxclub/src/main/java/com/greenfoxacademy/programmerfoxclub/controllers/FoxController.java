package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.greenfoxacademy.programmerfoxclub.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private final LoginService loginService;
    private final FoxService foxService;

    public FoxController(LoginService loginService, FoxService foxService) {
        this.loginService = loginService;
        this.foxService = foxService;
    }

    @GetMapping("/nutritionStore")
    public String selectFoodAndDrink(Model model, @RequestParam (required = false) String name){
        model.addAttribute("fox", loginService.getFox(name));
        model.addAttribute("name", name);
        model.addAttribute("foods", Food.values());
        model.addAttribute("drinks", Drink.values());
        return "nutritionstore";
    }

    @PostMapping("/nutritionStore")
    public String insertName(@RequestParam String name, @RequestParam Food food, @RequestParam Drink drink){
        foxService.setFood(name, food);
        foxService.setDrink(name, drink);
        return "redirect:/?name="+name;
    }

}
