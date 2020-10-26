package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private final FoxRepository foxRepository;

    public LoginServiceImpl(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }

    @Override
    public void addFox(String name) {
        foxRepository.addFox(name);
    }

    public Fox getFox(String name){
        return foxRepository.getFoxes()
                .stream()
                .filter(fox -> fox.getName().equalsIgnoreCase(name))
                .findAny().orElse(new Fox("Foxie"));
    }

}
