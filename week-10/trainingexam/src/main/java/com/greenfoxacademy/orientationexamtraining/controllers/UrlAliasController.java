package com.greenfoxacademy.orientationexamtraining.controllers;

import com.greenfoxacademy.orientationexamtraining.models.UrlAlias;
import com.greenfoxacademy.orientationexamtraining.services.UrlAliasService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UrlAliasController {

    private final UrlAliasService urlAliasService;

    public UrlAliasController(UrlAliasService urlAliasService) {
        this.urlAliasService = urlAliasService;
    }

    @GetMapping("/")
    public String getMainPage(){
        return "mainpage";
    }

    @PostMapping("/save-link")
    public String saveLink(Model model, @ModelAttribute UrlAlias urlAlias){
        model.addAttribute("isUrlAlias", urlAliasService.isUrlAlias(urlAlias.getAlias()));
        if(urlAliasService.isUrlAlias(urlAlias.getAlias())) {
            model.addAttribute("message", "Your alias is already in use!");
            model.addAttribute("url", urlAlias.getUrl());
            model.addAttribute("alias", urlAlias.getAlias());
        }
        else{
            urlAliasService.saveUrlAlias(urlAlias);
            model.addAttribute("message", "Your URL is aliased to " + urlAlias.getAlias() + " and your secrete code is " + urlAlias.getSecreteCode());
            model.addAttribute("url", "");
            model.addAttribute("alias", "");
        }
        return "mainpage";
    }


}
