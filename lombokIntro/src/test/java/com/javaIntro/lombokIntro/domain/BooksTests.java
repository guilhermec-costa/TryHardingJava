package com.javaIntro.lombokIntro.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static com.javaIntro.lombokIntro.DataUtil.createTestAuthor;

public class BooksTests {
    @Test
    public void bookNameShouldBeChurros() {
        LombokAuthor author = new LombokAuthor("Churros", "famlily", 9);
        BookLombok book = new BookLombok("Churros", 2024, author);
        assertEquals("Churros", book.getTitle());
    }

    @Test
    public void builderPatternTest() {
        BookLombok bookLombok = BookLombok.builder()
                .title("Churros book")
                .yearPublished(1900)
                .author(createTestAuthor())
                .build();
        System.out.println(bookLombok);
    }
}
