package com.springIntro.quickstart.services.impl;

import org.springframework.stereotype.Component;

import com.springIntro.quickstart.services.IRedPrinter;

@Component
public class EnglishRedPrinter implements IRedPrinter {

    @Override
    public String print() {
        return "RED";
    }

}
