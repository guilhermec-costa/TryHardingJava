package com.javaIntro.SpringAppDatabase.database.dao.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.javaIntro.SpringAppDatabase.database.DAOs.Impl.AuthorDAOImpl;
import com.javaIntro.SpringAppDatabase.database.domain.Author;

/**
 * AuthorDAOImplIntegrationTest
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class AuthorDAOImplIntegrationTest {

    private AuthorDAOImpl authorDAOImpl;
    
    @Autowired
    public AuthorDAOImplIntegrationTest(AuthorDAOImpl authorDAOImpl) {
        this.authorDAOImpl = authorDAOImpl;
    }
    
    @Test
    public void authorCanBeCreatedAndRecalled() {
        Author author = new Author(1L, "Churros", 9);
        authorDAOImpl.create(author);
        Optional<Author> authorResult = authorDAOImpl.findOne(author.id());
        System.out.println(authorResult.get().name());
    }

    @Test
    public void multipleAuthorsCanBeCreatedAndRecalled() {
        Author authorX = new Author(1L, "Churros", 9);
        Author authorY = new Author(2L, "Shoyou", 7);
        Author authorZ = new Author(3L, "Arnold", 6);
        authorDAOImpl.create(new ArrayList<Author>(Arrays.asList(
            authorX,
            authorY,
            authorZ
        )));

        List <Author> authors = authorDAOImpl.findMany();
        assertEquals(authors.size(), 3);
    }
    
}
