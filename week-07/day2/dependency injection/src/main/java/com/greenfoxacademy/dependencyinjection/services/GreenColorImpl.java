package com.greenfoxacademy.dependencyinjection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreenColorImpl implements MyColor {

    private final PrinterImpl printer;

    @Autowired
    public GreenColorImpl(PrinterImpl printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("green");
    }
}
