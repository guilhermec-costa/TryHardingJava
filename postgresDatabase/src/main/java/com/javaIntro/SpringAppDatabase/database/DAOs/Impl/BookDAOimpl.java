package com.javaIntro.SpringAppDatabase.database.DAOs.Impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.javaIntro.SpringAppDatabase.database.DAOs.BookDAO;

public class BookDAOimpl implements BookDAO {
    private final JdbcTemplate jdbcTemplate;

    public BookDAOimpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
}
