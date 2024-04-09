package com.springIntro.quickstart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springIntro.quickstart.services.IBluePrinter;
import com.springIntro.quickstart.services.IColourPrinter;
import com.springIntro.quickstart.services.IGreenPrinter;
import com.springIntro.quickstart.services.IRedPrinter;
import com.springIntro.quickstart.services.impl.ColourPrinterImpl;
import com.springIntro.quickstart.services.impl.EnglishBluePrinter;
import com.springIntro.quickstart.services.impl.EnglishGreenPrinter;
import com.springIntro.quickstart.services.impl.EnglishRedPrinter;
import com.springIntro.quickstart.services.impl.SpanishRedPrinter;

/**
 * PrinterConfig
 */
// @Configuration
public class PrinterConfig {
    // /*
    //  *  Configuration annotation tells Spring Framework to look for beans inside this class
    //  * 
    //  * */
    // 
    // @Bean
    // public IBluePrinter bluePrinter() {
    //     return new EnglishBluePrinter();
    // }
    //
    // @Bean
    // public IGreenPrinter greenPrinter() {
    //     return new EnglishGreenPrinter();
    // }
    //
    //
    // @Bean
    // public IRedPrinter redPrinter() {
    //     return new SpanishRedPrinter();
    // }
    //
    // @Bean
    // public IColourPrinter colorPrinter(IBluePrinter bluePrinter, IGreenPrinter greenPrinter, IRedPrinter redPrinter) {
    //     return new ColourPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    // }
    //
}
