package com.javaIntro.SpringAppDatabase.database.dao.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.javaIntro.SpringAppDatabase.database.DAOs.Impl.AuthorDAOImpl;
import com.javaIntro.SpringAppDatabase.database.domain.Author;

/**
 * AuthorDAOImplIntegrationTest
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AuthorDAOImplIntegrationTest {

    private AuthorDAOImpl authorDAOImpl;
    
    @Autowired
    public AuthorDAOImplIntegrationTest(AuthorDAOImpl authorDAOImpl) {
        this.authorDAOImpl = authorDAOImpl;
    }
    
    @Test
    public void authorCanBeCreatedAndRecalled() {
        Author author = new Author("Churros", 9);
        authorDAOImpl.create(author);
    }
    
}
