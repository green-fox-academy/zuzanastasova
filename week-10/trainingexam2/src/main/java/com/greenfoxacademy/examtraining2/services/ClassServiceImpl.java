package com.greenfoxacademy.examtraining2.services;

import com.greenfoxacademy.examtraining2.models.GFAClass;
import com.greenfoxacademy.examtraining2.repositories.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{

    private final ClassRepository classRepository;

    public ClassServiceImpl(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @Override
    public List<GFAClass> findAllClasses() {
        return classRepository.findAll();
    }

    public GFAClass findClassByName(String name){
        return classRepository.findGFAClassByName(name);
    }

    public Long findClassIdByClassName(String className){
        return classRepository.findClassIdByClassName(className);
    }
}
