package com.javaIntro.lombokIntro.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BooksTests {
    @Test
    public void bookNameShouldBeChurros() {
        LombokAuthor author = new LombokAuthor("Churros", "famlily", 9);
        BookLombok book = new BookLombok("Churros", 2024, author);
        assertEquals("Churros", book.getTitle());
    }
}

