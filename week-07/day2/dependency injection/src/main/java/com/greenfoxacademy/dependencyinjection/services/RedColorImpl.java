package com.greenfoxacademy.dependencyinjection.services;

import org.springframework.beans.factory.annotation.Autowired;

public class RedColorImpl implements MyColor{

    private final Printer printer;

    public RedColorImpl(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("red");
    }
}
