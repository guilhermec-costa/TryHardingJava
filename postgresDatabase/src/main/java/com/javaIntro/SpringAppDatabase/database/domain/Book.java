package com.javaIntro.SpringAppDatabase.database.domain;

public record Book(
    String isbn,
    String title,
    Long authorId
) {}
