package com.javaIntro.SpringAppDatabase.database.dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

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
    }
}
