package com.javaIntro.SpringAppDatabase.database.DAOs.Impl;

import com.javaIntro.SpringAppDatabase.database.DAOs.AuthorDAO;
import com.javaIntro.SpringAppDatabase.database.domain.Author;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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

    @Override
    public Optional<Author> findOne(Long authorId) {
        List<Author> authors = jdbcTemplate.query(
                "select * from authors where id = ?;",
                new AuthorRowMapper(),
                authorId
        );

        return authors.stream().findFirst();
    }

    public static class AuthorRowMapper implements RowMapper<Author> {

        @Override
        public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Author(
                    rs.getString("name"),
                    rs.getInt("age")
            );
        }
    }
}
