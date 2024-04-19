package com.javaIntro.SpringAppDatabase.database.DAOs.Impl;

import com.javaIntro.SpringAppDatabase.database.DAOs.AuthorDAO;
import com.javaIntro.SpringAppDatabase.database.domain.Author;

import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDAOImpl implements AuthorDAO {
    
    private final JdbcTemplate jdbcTemplate;

    public AuthorDAOImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
       jdbcTemplate.update(
            "insert into authors (name, age) values (?, ?);",
            author.name(), author.age()
        );
    }

}
