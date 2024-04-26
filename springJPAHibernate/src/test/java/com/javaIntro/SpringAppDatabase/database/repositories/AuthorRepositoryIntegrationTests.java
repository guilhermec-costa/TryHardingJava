package com.javaIntro.SpringAppDatabase.database.repositories;

import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestAuthorA;
import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestAuthorB;
import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestAuthorC;
import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestBookC;

import java.util.Optional;
import java.util.logging.Logger;
import org.hibernate.mapping.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.javaIntro.SpringAppDatabase.database.domain.Author;

/**
 * AuthorDAOImplIntegrationTest
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class AuthorRepositoryIntegrationTests {

    private AuthorRepository authorRepository;
    private Logger logger = Logger.getLogger(AuthorRepositoryIntegrationTests.class.getName());

    @Autowired
    public AuthorRepositoryIntegrationTests(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Test
    public void testThatAuthorCanBeCreatedAndRecalled() {
        Author author = createTestAuthorA();
        authorRepository.save(author);

        Optional<Author> persistedAuthor = authorRepository.findById(author.getId());
        System.out.println(persistedAuthor);
        assertEquals(Long.valueOf(1L), persistedAuthor.get().getId());
    }

    @Test
    public void testThatManyAuthorsCanBeRetrived() {
        Author authorX = createTestAuthorA();
        Author authorY = createTestAuthorB();
        Author authorZ = createTestAuthorC();
        authorRepository.save(authorX);
        authorRepository.save(authorY);
        authorRepository.save(authorZ);

        Iterable<Author> authors = authorRepository.findAll();
        for (Author author : authors) {
            System.out.println(author);
        }
    }

    @Test
    public void testThatOneAuthorCanBeUpdated() {
        Author author = createTestAuthorA();
        authorRepository.save(author);
        author.setName("Name updated");
        authorRepository.save(author);
        Optional<Author> persistedAuthor = authorRepository.findById(author.getId());
        System.out.println(persistedAuthor);
    }

    @Test
    public void testAuthorCanBeDeleted() {
        Author author = createTestAuthorA();
        authorRepository.save(author);
        authorRepository.delete(author);
        Optional<Author> deletedAuthor = authorRepository.findById(author.getId());
        // logger.info(Boolean.valueOf(deletedAuthor.isEmpty()).toString());
        assertEquals(true, deletedAuthor.isEmpty());
    }

    @Test
    public void testGetAuthorsWithAgeLessThan() {
        Author authorA = createTestAuthorA();
        Author authorB = createTestAuthorB();
        Author authorC = createTestAuthorC();
        authorRepository.save(authorA);
        authorRepository.save(authorB);
        authorRepository.save(authorC);

        Iterable<Author> authors = authorRepository.ageLessThan(40);
        for (Author author : authors) {
            System.out.println("test: " + author);
        }
    }
}
