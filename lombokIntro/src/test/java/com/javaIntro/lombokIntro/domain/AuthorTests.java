package com.javaIntro.lombokIntro.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuthorTests {
    @Test
    public void authorNameShouldBeChurros() {
        LombokAuthor author = new LombokAuthor("Churros", "famlily", 9);
        assertEquals("Churros", author.getGivenName());
    }
}


