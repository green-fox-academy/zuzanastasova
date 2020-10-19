package com.greenfoxacademy.webshop.repositories;

import com.greenfoxacademy.webshop.models.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class WebShopRepository {

    private List<ShopItem> items;

    public WebShopRepository(){
        items = new ArrayList<>();
        items.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
        items.add(new ShopItem("Printer", "HP W-3451 printer", 3000, 2));
        items.add(new ShopItem("Coca-cola","Standard Coke", 25, 0));
        items.add(new ShopItem("Wokin", "Wokin sauce with rice", 119, 100));
        items.add(new ShopItem("T-Shirt", "Blue with a dog",300, 1));
    }


    public List<ShopItem> getItems(){
        return items;
    }

    public void addItems(ShopItem item){
        items.add(item);
    }

}
