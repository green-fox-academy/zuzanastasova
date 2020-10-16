package com.greenfoxacademy.homework.controllers;

import com.greenfoxacademy.homework.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    @RequestMapping(method = RequestMethod.GET, path = "/show")
    public String createBankAccount(Model model){
        model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion", true));
        return "show";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/string")
    public String displayString(Model model){
        model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "displayString";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/characters")
    public String charactersList(Model model){

        List<BankAccount> characters = new ArrayList<>();
        characters.add(new BankAccount("Mufasa", 10000, "lion", true));
        characters.add(new BankAccount("Pumbaa", 3000, "warthog", false));
        characters.add(new BankAccount("Timon", 4000, "meerkat", false));
        characters.add(new BankAccount("Rafiki", 6000, "bird", false));

        model.addAttribute("characters", characters);

        return "characters";
    }

}
