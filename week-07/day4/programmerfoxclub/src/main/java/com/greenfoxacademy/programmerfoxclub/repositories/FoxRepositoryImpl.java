package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoxRepositoryImpl implements FoxRepository{

    private List<Fox> foxes;

    public FoxRepositoryImpl() {
        foxes = new ArrayList<>();
        foxes.add(new Fox("Mr. Green"));
    }

    @Override
    public void addFox(String name) {
        foxes.add(new Fox(name));
    }

    public List<Fox> getFoxes(){
        return foxes;
    }

}
