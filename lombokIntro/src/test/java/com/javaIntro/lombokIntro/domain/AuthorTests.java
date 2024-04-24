package com.javaIntro.lombokIntro.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuthorTests {
    @Test
    public void authorNameShouldBeChurros() {
        LombokAuthor author = new LombokAuthor("Churros", "famlily", 9);
        System.out.println(author);
        assertEquals("Churros", author.getGivenName());
    }

    public void testingBuilderPattern() {
        LombokAuthor lombokAuthor = LombokAuthor.builder()
            .givenName("Churros")
            .familyName("churros family")
            .age(9)
            .build();
        System.out.println(lombokAuthor);
    }
}


