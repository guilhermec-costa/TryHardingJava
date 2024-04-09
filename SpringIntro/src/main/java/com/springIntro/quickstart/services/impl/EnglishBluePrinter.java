package com.springIntro.quickstart.services.impl;

import org.springframework.stereotype.Component;

import com.springIntro.quickstart.services.IBluePrinter;

@Component
public class EnglishBluePrinter implements IBluePrinter {

    @Override
    public String print() {
        return "BLUE";
    }

}
