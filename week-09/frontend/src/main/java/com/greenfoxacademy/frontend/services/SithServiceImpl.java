package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.repositories.SithRepository;
import org.springframework.stereotype.Service;

@Service
public class SithServiceImpl implements SithService {

    private final SithRepository sithRepository;

    public SithServiceImpl(SithRepository sithRepository) {
        this.sithRepository = sithRepository;
    }

    public String sith_text(String text){
        String sith_text = null;

        return sith_text;
    }
}
