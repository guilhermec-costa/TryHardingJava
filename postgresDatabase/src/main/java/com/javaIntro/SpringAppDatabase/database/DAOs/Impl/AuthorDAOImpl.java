package com.javaIntro.SpringAppDatabase.database.DAOs.Impl;

import com.javaIntro.SpringAppDatabase.database.DAOs.AuthorDAO;
import com.javaIntro.SpringAppDatabase.database.domain.Author;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorDAOImpl implements AuthorDAO {
        
    private final JdbcTemplate jdbcTemplate;

    public AuthorDAOImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
        jdbcTemplate.update(
            "insert into authors (id, name, age) values (?, ?, ?);",
            author.id(), author.name(), author.age()
        );
    }


    @Override
    public void create(List<Author> authors) {
        for(Author author: authors) {
            jdbcTemplate.update(
                "insert into authors (id, name, age) values (?, ?, ?)",
                author.id(), author.name(), author.age()
            );
        }
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

    @Override
    public List<Author> findMany() {
        List<Author> authors = jdbcTemplate.query(
                "select * from authors;",
                new AuthorRowMapper());

        return authors;
    }


    @Override
    public void update(Long id, Author author) {
        jdbcTemplate.update(
            "update authors set id = ?, name = ?, age = ? where id = ?;",
            author.id(),
            author.name(),
            author.age(),
            id
        );
    }

    @Override
    public void delete(Author author) {
        jdbcTemplate.update(
            "delete from authors where id = ?;",
            author.id()
        );
    }


    public static class AuthorRowMapper implements RowMapper<Author> {

        @Override
        public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Author(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getInt("age")
            );
        }
    }
}
