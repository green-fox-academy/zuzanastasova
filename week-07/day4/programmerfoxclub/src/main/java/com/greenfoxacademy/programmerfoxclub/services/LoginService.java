package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

import java.util.List;

public interface LoginService {

    public void addFox(String name);
    public Fox getFox(String name);

}
