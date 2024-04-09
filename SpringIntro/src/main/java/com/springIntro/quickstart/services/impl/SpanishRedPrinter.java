package com.springIntro.quickstart.services.impl;

import com.springIntro.quickstart.services.IRedPrinter;

/**
 * SpanishRedPrinter
 */
public class SpanishRedPrinter implements IRedPrinter {

    @Override
    public String print() {
        return "rojo";
    }
    
}
