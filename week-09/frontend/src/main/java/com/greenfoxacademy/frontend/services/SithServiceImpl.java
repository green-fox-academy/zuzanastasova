package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.repositories.SithRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SithServiceImpl implements SithService {

    public String sith_text(String text){
        String sith_text = "";
        String[] words = text.split(" ");
        for (int i = 1; i <= words.length; i+=2) {
            words[i] = words[i-1];

        }
        return sith_text;
    }
}
