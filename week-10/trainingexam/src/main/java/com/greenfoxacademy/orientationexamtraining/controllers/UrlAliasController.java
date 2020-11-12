package com.greenfoxacademy.orientationexamtraining.controllers;

import com.greenfoxacademy.orientationexamtraining.models.UrlAlias;
import com.greenfoxacademy.orientationexamtraining.services.UrlAliasService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
        model.addAttribute("isUrlAlias", urlAliasService.isUrlAliasExistingByAlias(urlAlias.getAlias()));
        if(urlAliasService.isUrlAliasExistingByAlias(urlAlias.getAlias())) {
            model.addAttribute("message", "Your alias is already in use!");
            model.addAttribute("url", urlAlias.getUrl());
            model.addAttribute("alias", urlAlias.getAlias());
        }
        else{
            urlAliasService.saveUrlAlias(urlAlias);
            model.addAttribute("message", "Your URL is aliased to " + urlAlias.getAlias() + " and your secrete code is " + urlAlias.getSecretCode());
            model.addAttribute("url", "");
            model.addAttribute("alias", "");
        }
        return "mainpage";
    }

    @GetMapping("/a/{alias}")
    public ModelAndView redirectToUrl(@PathVariable String alias, HttpServletRequest request) {

        if(urlAliasService.isUrlAliasExistingByAlias(alias)) {
            UrlAlias urlAlias = urlAliasService.findUrlAliasByAlias(alias);
            Integer hitCount = urlAlias.getHitCount() + 1;
            urlAlias.setHitCount(hitCount);
            urlAliasService.saveUrlAlias(urlAlias);
            return new ModelAndView("redirect:" + urlAliasService.findUrlAliasByAlias(alias).getUrl());
        } else {
            request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.NOT_FOUND);
            return new ModelAndView("404", HttpStatus.NOT_FOUND);
        }
    }

    @ResponseBody
    @GetMapping("/api/links")
    public List<UrlAlias> renderAll(){
        return urlAliasService.getAllUrlAliases();
    }

    @DeleteMapping("/api/links/{id}")
    public ModelAndView deleteById(@PathVariable Long id, @RequestBody String secreteCode, HttpServletRequest request){

        if(urlAliasService.findUrlAliasById(id).getSecretCode().equals(secreteCode)) {
            urlAliasService.deleteUrlAlias(id);
            return new ModelAndView("redirect:/api/links/"+id, HttpStatus.NO_CONTENT);
        } else if (!urlAliasService.findUrlAliasById(id).getSecretCode().equals(secreteCode)){
            request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.NOT_FOUND);
            return new ModelAndView("403", HttpStatus.FORBIDDEN);
        } else if (!urlAliasService.isUrlAliasExistingById(id)){
            request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.NOT_FOUND);
            return new ModelAndView("404", HttpStatus.NOT_FOUND);
        } else
            return null;
    }




}
