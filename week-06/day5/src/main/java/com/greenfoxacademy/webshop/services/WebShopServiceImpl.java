package com.greenfoxacademy.webshop.services;

import com.greenfoxacademy.webshop.models.ShopItem;
import com.greenfoxacademy.webshop.repositories.WebShopRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WebShopServiceImpl implements WebShopServiceInterface {

    private final WebShopRepository items = new WebShopRepository();

    @Override
    public void addShopItem(ShopItem item) {
        items.addItems(item);
    }

    @Override
    public ShopItem getShopItemByName(String name) {
        return null;
    }

    @Override
    public List<ShopItem> getAllShopItems() {
        return items.getItems();
    }

    public List<ShopItem> getAvailable(){
        return items.getItems().stream().filter(item -> item.getQuantityOfStock()>0).collect(Collectors.toList());
    }

    public List<ShopItem> getCheapestFirst() {
        return items.getItems().stream().sorted(Comparator.comparing(ShopItem::getPrice)).collect(Collectors.toList());
    }

    @Override
    public ShopItem getContainsNike(String name) {
        Optional<ShopItem> Nike = items.getItems().stream().filter(item -> item.getDescription().contains(name) || item.getName().equalsIgnoreCase(name)).findAny();
        return Nike.orElse(null);
    }

    @Override
    public double getAverageStock() {
        Optional<Double> average = Optional.of(items.getItems().stream().mapToDouble(ShopItem::getQuantityOfStock).average().getAsDouble());
        return average.orElse(null);
    }

    @Override
    public ShopItem getMostExpensive() {
        Optional<ShopItem> mostExpensive = items.getItems().stream().max(Comparator.comparing(ShopItem::getPrice));
        return mostExpensive.orElse(null);
    }
}
