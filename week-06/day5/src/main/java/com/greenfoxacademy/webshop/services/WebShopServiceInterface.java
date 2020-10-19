package com.greenfoxacademy.webshop.services;

import com.greenfoxacademy.webshop.models.ShopItem;

import java.util.List;

public interface WebShopServiceInterface {

    void addShopItem (ShopItem item);
    ShopItem getShopItemByName (String name);
    List<ShopItem> getAllShopItems();
    public List<ShopItem> getAvailable();
    public List<ShopItem> getCheapestFirst();
    public ShopItem getContainsNike(String name);
    public double getAverageStock();
    public ShopItem getMostExpensive();
}
