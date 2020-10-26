package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoxServiceImpl implements FoxService{

    private final FoxRepository foxRepository;

    public FoxServiceImpl(FoxRepositoryImpl foxRepositoryImpl) {
        this.foxRepository = foxRepositoryImpl;
    }

    public List<Fox> getFoxes() {
        return foxRepository.getFoxes();
    }

    @Override
    public Fox getFoxByName(String name) {
        Optional<Fox> optionalFox = foxRepository.getFoxes().stream()
                .filter(fox -> fox.getName().equals(name))
                .findAny();

        return optionalFox.orElse(null);
    }

    @Override
    public void setFood(String name, Food food) {
        getFoxByName(name).setFood(food);
    }

    @Override
    public void setDrink(String name, Drink drink) {
        getFoxByName(name).setDrink(drink);
    }

}
