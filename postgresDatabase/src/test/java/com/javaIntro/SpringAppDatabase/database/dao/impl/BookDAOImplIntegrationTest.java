package com.javaIntro.SpringAppDatabase.database.dao.impl;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.javaIntro.SpringAppDatabase.database.DAOs.Impl.BookDAOimpl;
import com.javaIntro.SpringAppDatabase.database.domain.Book;

/**
 * BookDAOImplIntegrationTest
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BookDAOImplIntegrationTest {

    private BookDAOimpl bookDAOimpl;
    
    @Autowired
    public BookDAOImplIntegrationTest(BookDAOimpl bookDAOimpl) {
        this.bookDAOimpl = bookDAOimpl;
    }

    @Test
    public void testThatBookCanBeCreated() {
        Book book = new Book("xxxyyyxx", "A random book", 1L);
        bookDAOimpl.create(book);
        Optional<Book> bookResult = bookDAOimpl.findOne(book.isbn());
        System.out.println(bookResult.get().title());

    }
}
