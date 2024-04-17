package com.javaIntro.lombokIntro;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) 
    {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper);
        final var test = new ObjectMapper();
    }
}
