package com.javaIntro.lombokIntro;

import java.util.logging.Level;
import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class App {
    // final static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        log.info("App started");
    }
}
