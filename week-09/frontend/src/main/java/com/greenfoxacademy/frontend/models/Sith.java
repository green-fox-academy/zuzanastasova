package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sith {

    private String text;
    private String sith_text;
    private List<String> randomWords;

    public Sith() {
    }

    public Sith(String text, String sith_text) {
        this.text = text;
        this.sith_text = sith_text;
        this.randomWords = Arrays.asList("Hmmm.", "Err...err..err.","Uhm.", "Padawan.", "Yoda");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSith_text() {
        return sith_text;
    }

    public void setSith_text(String sith_text) {
        this.sith_text = sith_text;
    }
}
