package com.greenfoxacademy.examtraining2.services;

import com.greenfoxacademy.examtraining2.models.GFAClass;

import java.util.List;

public interface ClassService {
    List<GFAClass> findAllClasses();
    GFAClass findClassByName(String name);
}
