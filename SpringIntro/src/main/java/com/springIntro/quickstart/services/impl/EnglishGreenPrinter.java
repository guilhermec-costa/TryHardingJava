package com.springIntro.quickstart.services.impl;

import org.springframework.stereotype.Component;

import com.springIntro.quickstart.services.IGreenPrinter;

@Component
public class EnglishGreenPrinter implements IGreenPrinter {

    @Override
    public String print() {
            return "GREEN";
    }

}
