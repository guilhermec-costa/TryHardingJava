package com.javaIntro.lombokIntro.domain;


import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

/**
 * A Book written by an {@link LombokAuthor}.
 */
@Getter
@Setter
public class BookLombok {

    private String title;

    private Integer yearPublished;

    private LombokAuthor author;


    public BookLombok() {
    }

    public BookLombok(String title, Integer yearPublished, LombokAuthor author) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLombok book = (BookLombok) o;
        return Objects.equals(title, book.title) && Objects.equals(yearPublished, book.yearPublished) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublished, author);
    }

    @Override
    public String toString() {
        return "Book(" +
                "title=" + title +
                ", yearPublished=" + yearPublished +
                ", author=" + author +
                ')';
    }
}
