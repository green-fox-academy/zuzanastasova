package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

import java.util.List;

public interface FoxRepository {

    public void addFox(String name);
    public List<Fox> getFoxes();

}
