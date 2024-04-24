package com.javaIntro.lombokIntro;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaIntro.lombokIntro.domain.Author;
import com.javaIntro.lombokIntro.domain.LombokAuthor;

public class App 
{
    public static void main( String[] args ) 
    {
        Author authorX = new Author("Churros", "family", 9);
        LombokAuthor authorY = new LombokAuthor("Churros", "family", 9);

    }
}
