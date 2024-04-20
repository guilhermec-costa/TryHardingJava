package com.javaIntro.SpringAppDatabase.database.dao.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

import com.javaIntro.SpringAppDatabase.database.DAOs.Impl.AuthorDAOImpl;
import com.javaIntro.SpringAppDatabase.database.domain.Author;

/**
 * AuthorDAOImplTest
 */
@ExtendWith(MockitoExtension.class)
public class AuthorDAOImplTest {
    
    @Mock
    private JdbcTemplate jdbcTemplate;
    
    @InjectMocks
    private AuthorDAOImpl authorDAOImpl;    

    @Test
    public void testThatCreateAuthorGeneratesCorrectSQL() {
        Author author = new Author("Churros", 8);
        authorDAOImpl.create(author);
        verify(jdbcTemplate).
            update(
                eq("insert into authors (name, age) values (?, ?);"),
                eq("Churros"),
                eq(8)
            );
    }

    @Test
    public void testThatFindOneAuthorGenetaresCorrectSQL() {
        authorDAOImpl.findOne(1L);
        verify(jdbcTemplate).query(
            eq("select * from authors where id = ?;"),
            ArgumentMatchers.<AuthorDAOImpl.AuthorRowMapper>any(),
            eq(1L)
        );
    }

}
