package com.javaIntro.SpringAppDatabase.database.dao.impl;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.javaIntro.SpringAppDatabase.database.DAOs.Impl.AuthorDAOImpl;
import com.javaIntro.SpringAppDatabase.database.DAOs.Impl.BookDAOimpl;
import com.javaIntro.SpringAppDatabase.database.domain.Author;
import com.javaIntro.SpringAppDatabase.database.domain.Book;

/**
 * BookDAOImplIntegrationTest
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BookDAOImplIntegrationTest {

    private BookDAOimpl bookDAOimpl;
    private AuthorDAOImpl authorDAOImpl;
    
    @Autowired
    public BookDAOImplIntegrationTest(BookDAOimpl bookDAOimpl, AuthorDAOImpl authorDAOImpl) {
        this.bookDAOimpl = bookDAOimpl;
        this.authorDAOImpl = authorDAOImpl;
    }

    @Test
    public void testThatBookCanBeCreated() {
        Author author = new Author(1L, "Churros", 9);
        authorDAOImpl.create(author);
        Book book = new Book("xxxyyyxx", "A random book", author.id());
        bookDAOimpl.create(book);
        Optional<Book> bookResult = bookDAOimpl.findOne(book.isbn());
        System.out.println(bookResult.get().title());

    }

}
