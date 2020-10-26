package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;

import java.util.List;

public interface FoxService {

     public List<Fox> getFoxes();
     public Fox getFoxByName(String name);
     public void setFood(String name, Food food);
     public void setDrink(String name, Drink drink);

}
