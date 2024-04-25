package com.javaIntro.SpringAppDatabase.database;

import com.javaIntro.SpringAppDatabase.database.domain.Author;

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
}
