package com.javaIntro.SpringAppDatabase.database;

import com.javaIntro.SpringAppDatabase.database.domain.Author;
import com.javaIntro.SpringAppDatabase.database.domain.Book;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("Churros 1")
                .age(7)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("Churros 2")
                .age(4)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("Churros 3")
                .age(50)
                .build();
    }

    public static Book createTestBookA(final Author author) {
        return Book.builder()
            .isbn("123.456.789.123-12")
            .title("Churros book 1")
            .author(author)
            .build();
    }

    public static Book createTestBookB(final Author author) {
        return Book.builder()
            .isbn("123.456.789.123-13")
            .title("Churros book 2")
            .author(author)
            .build();
    }

    public static Book createTestBookC(final Author author) {
        return Book.builder()
            .isbn("123.456.789.123-14")
            .title("Churros book 3")
            .author(author)
            .build();
    }
}
