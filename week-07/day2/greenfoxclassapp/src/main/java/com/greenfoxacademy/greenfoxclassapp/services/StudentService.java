package com.greenfoxacademy.greenfoxclassapp.services;

import java.util.List;

public interface StudentService {

    public List<String> findAll();
    public void save(String student);
    public int count();
    public String check(String name);
}
