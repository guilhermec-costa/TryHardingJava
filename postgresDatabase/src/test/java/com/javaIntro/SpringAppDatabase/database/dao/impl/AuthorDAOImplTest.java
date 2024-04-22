package com.javaIntro.SpringAppDatabase.database.dao.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

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
        Author author = new Author(1L, "Churros", 8);
        authorDAOImpl.create(author);
        verify(jdbcTemplate).
            update(
                eq("insert into authors (id, name, age) values (?, ?, ?);"),
                eq(1L),
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

    @Test
    public void testThatFindManyAuthorGeneratesCorrectSQL() {
       authorDAOImpl.findMany();
       verify(jdbcTemplate).query(
            eq("select * from authors;"),
            ArgumentMatchers.<AuthorDAOImpl.AuthorRowMapper>any()
        );
    }

    @Test
    public void testThatFullyUpdateAuthorGeneratesCorrectSQL() {
        Author author = new Author(5L, "Guilherme", 20);
        authorDAOImpl.update(1L, author);
        verify(jdbcTemplate).update(
            eq("update authors set id = ?, name = ?, age = ? where id = ?;"),
            eq(author.id()),
            eq(author.name()), 
            eq(author.age()),
            eq(1L)
        );
    }

    @Test
    public void testThatDeleteAuthorGeneratesCorrectSQL() {
        Author author = new Author(1L, "Churros", 9);
        authorDAOImpl.create(author);
        authorDAOImpl.delete(author);

        verify(jdbcTemplate).update(
            eq("delete from authors where id = ?;"),
            eq(author.id())
        );
    }
}
