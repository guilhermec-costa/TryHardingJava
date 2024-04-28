package com.javaIntro.SpringAppDatabase.database.repositories;

import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestAuthorA;
import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestBookA;
import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestBookC;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.javaIntro.SpringAppDatabase.database.domain.entities.Author;
import com.javaIntro.SpringAppDatabase.database.domain.entities.Book;

/**
 * BookDAOImplIntegrationTest
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BookRepositoryIntegrationTests {

    private BookRepository bookRepository;

    @Autowired
    public BookRepositoryIntegrationTests(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Test
    public void bookCanBeCreatedAndRecalled() {
        Author author = createTestAuthorA();
        Book book = createTestBookA(author);
        bookRepository.save(book);

        Optional<Book> persistedBook = bookRepository.findById(book.getIsbn());
        System.out.println(persistedBook.get().getIsbn());
    }

    @Test
    public void manyBooksCanBeCreatedAndRecalled() {
        Book bookX = createTestBookA(createTestAuthorA());
        Book bookY = createTestBookA(createTestAuthorA());
        Book bookZ = createTestBookA(createTestAuthorA());

        bookRepository.save(bookX);
        bookRepository.save(bookY);
        bookRepository.save(bookZ);

        Iterable<Book> books = bookRepository.findAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testThatOneBookCanBeUpdated() {
        Author authorX = createTestAuthorA();
        Book bookX = createTestBookC(authorX);
        bookX.setTitle("Title updated");
        bookRepository.save(bookX);
        Optional<Book> book = bookRepository.findById(bookX.getIsbn());
        System.out.println(book);
    }

    @Test
    public void testThatBookCanBeDeleted() {
        Author authorX = createTestAuthorA();
        Book book = createTestBookC(authorX);
        bookRepository.save(book);
        bookRepository.delete(book);
        Optional<Book> deletedBook = bookRepository.findById(book.getIsbn());
        assertEquals(true, deletedBook.isEmpty());
    }
}
