package com.greenfoxacademy.firstspringproject.models;

public class GreetCount {

    private final long greetCount;
    private final String content;

    public GreetCount(long greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public long getGreetCount() {
            return greetCount;
    }

    public String getContent() {
            return content;
    }

}
