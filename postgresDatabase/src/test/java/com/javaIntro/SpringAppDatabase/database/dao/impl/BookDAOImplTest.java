package com.javaIntro.SpringAppDatabase.database.dao.impl;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.mockito.ArgumentMatchers.eq;

import com.javaIntro.SpringAppDatabase.database.DAOs.Impl.BookDAOimpl;
import com.javaIntro.SpringAppDatabase.database.domain.Book;

/**
 * BookDAOImplTest
 */
@ExtendWith(MockitoExtension.class)
public class BookDAOImplTest {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private BookDAOimpl bookDAOimpl;
    
    @Test
    public void testThatCreateBookGeneratesCorrectSQL() {
        Book book = new Book("xxxxxxx", "Churros's books", 1L);
        bookDAOimpl.create(book);
        verify(jdbcTemplate).update(
                eq("insert into books (isbn, title, author_id) values (?, ?, ?);"),
                eq("xxxxxxx"),
                eq("Churros's books"),
                eq(1L)
        );
    }
}
