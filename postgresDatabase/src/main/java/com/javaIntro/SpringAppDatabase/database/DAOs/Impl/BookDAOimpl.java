package com.javaIntro.SpringAppDatabase.database.DAOs.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.javaIntro.SpringAppDatabase.database.DAOs.BookDAO;
import com.javaIntro.SpringAppDatabase.database.domain.Book;

public class BookDAOimpl implements BookDAO {
    private final JdbcTemplate jdbcTemplate;

    public BookDAOimpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public void create(Book book) {
        jdbcTemplate.update(
            "insert into books (isbn, title, author_id) values (?, ?, ?);", 
            book.isbn(),
            book.title(),
            book.authorId()
        );
    }
    
    @Override
    public Optional<Book> findOne(String isbn) {
        List<Book> books = jdbcTemplate.query(
            "select * from books where id = ?;",
            new BookRowMapper(),
            isbn
        );
        return books.stream().findFirst();
    }

    public static class BookRowMapper implements RowMapper<Book> {

        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Book(
                    rs.getString("isbn"),
                    rs.getString("title"),
                    rs.getLong("author_id")
            );
        }

        
    }
    
}
