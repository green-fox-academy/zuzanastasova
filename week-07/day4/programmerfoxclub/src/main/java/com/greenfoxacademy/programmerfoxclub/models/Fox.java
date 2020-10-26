package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<String> tricks;
    private Food food;
    private Drink drink;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = Food.salad;
        this.drink = Drink.water;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food.toString();
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String getDrink() {
        return drink.toString();
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
