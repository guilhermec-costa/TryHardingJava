package com.springIntro.quickstart.services.impl;

import org.springframework.stereotype.Component;

import com.springIntro.quickstart.services.IBluePrinter;
import com.springIntro.quickstart.services.IColourPrinter;
import com.springIntro.quickstart.services.IGreenPrinter;
import com.springIntro.quickstart.services.IRedPrinter;

@Component
// says: Spring, i am a bean
public class ColourPrinterImpl implements IColourPrinter {
    
    // dependency injection here
    private IRedPrinter redPrinter;
    private IBluePrinter bluePrinter;
    private IGreenPrinter greenPrinter;
    
    public ColourPrinterImpl(
                IRedPrinter redPrinter, 
                IGreenPrinter greenPrinter, 
                IBluePrinter bluePrinter
            ) 
    {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.format("Colours: %s, %s and %s .", this.redPrinter.print(), this.bluePrinter.print(), this.greenPrinter.print());
    }

}
