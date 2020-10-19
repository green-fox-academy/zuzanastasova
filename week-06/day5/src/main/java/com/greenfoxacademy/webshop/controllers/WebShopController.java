package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import com.greenfoxacademy.webshop.services.WebShopServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WebShopController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/webshop")
    public String webShop(Model model){
        WebShopServiceImpl items = new WebShopServiceImpl();
        model.addAttribute("items", items.getAllShopItems());
        return "webshop";
    }

    @GetMapping("/webshop/only-available")
    public String onlyAvailable(Model model){
        WebShopServiceImpl items = new WebShopServiceImpl();
        model.addAttribute("items", items.getAvailable());
        return "webshop";
    }

    @GetMapping("/webshop/cheapest-first")
    public String cheapestFirst(Model model){
        WebShopServiceImpl items = new WebShopServiceImpl();
        model.addAttribute("items", items.getCheapestFirst());
        return "webshop";
    }

    @GetMapping("/webshop/contains-nike")
    public String containsNike(Model model){
        WebShopServiceImpl items = new WebShopServiceImpl();
        model.addAttribute("items", items.getContainsNike("Nike"));
        return "webshop";
    }

    @GetMapping("/webshop/average-stock")
    public String averageStock(Model model){
        WebShopServiceImpl items = new WebShopServiceImpl();
        model.addAttribute("average", items.getAverageStock());
        return "webshopaverage";
    }

    @GetMapping("/webshop/most-expensive")
    public String mostExpensive(Model model){
        WebShopServiceImpl items = new WebShopServiceImpl();
        model.addAttribute("items", items.getMostExpensive());
        return "webshop";
    }
}
