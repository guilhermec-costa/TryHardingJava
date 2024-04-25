package com.javaIntro.SpringAppDatabase.database;

import com.javaIntro.SpringAppDatabase.database.domain.Author;
import com.javaIntro.SpringAppDatabase.database.domain.Book;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static Book createTestBookA(final Author author) {
        return Book.builder()
            .isbn("123.456.789.123-12")
            .title("Churros book")
            .author(author)
            .build();
    }
}
