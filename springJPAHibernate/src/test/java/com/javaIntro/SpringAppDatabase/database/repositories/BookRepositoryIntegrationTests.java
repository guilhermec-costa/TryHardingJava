package com.javaIntro.SpringAppDatabase.database.repositories;

import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestAuthorA;
import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestBookA;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.javaIntro.SpringAppDatabase.database.domain.Author;
import com.javaIntro.SpringAppDatabase.database.domain.Book;


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
        for(Book book: books) {
            System.out.println(book);
        }
    }
}
