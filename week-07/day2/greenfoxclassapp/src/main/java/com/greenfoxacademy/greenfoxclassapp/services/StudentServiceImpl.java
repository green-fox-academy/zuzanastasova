package com.greenfoxacademy.greenfoxclassapp.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private List<String> names;

    public StudentServiceImpl() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    @Override
    public int count() {
        return names.size();
    }

    @Override
    public String check(String name){
        if (names.contains(name)) {
            return name + " is already in the list.";
        } else
            names.add(name);
            return name + " was added to the list.";
    }
}
