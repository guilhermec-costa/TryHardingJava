package com.javaIntro.SpringAppDatabase.database.DAOs.Impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.javaIntro.SpringAppDatabase.database.DAOs.BookDAO;
import com.javaIntro.SpringAppDatabase.database.domain.Book;

public class BookDAOimpl implements BookDAO {
    private final JdbcTemplate jdbcTemplate;

    public BookDAOimpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(Book book) {
        jdbcTemplate.update(
            "insert into books (isbn, title, author_id) values (?, ?, ?);", 
            book.isbn(),
            book.title(),
            book.authorId()
        );
    }
    
}
