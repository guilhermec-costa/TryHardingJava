// package com.javaIntro.SpringAppDatabase.database.repositories;
//
//
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Optional;
//
// import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
//
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.annotation.DirtiesContext;
// import org.springframework.test.context.junit.jupiter.SpringExtension;
//
// import com.javaIntro.SpringAppDatabase.database.domain.Author;
// import com.javaIntro.SpringAppDatabase.database.domain.Book;
//
// /**
//  * BookDAOImplIntegrationTest
//  */
// @SpringBootTest
// @ExtendWith(SpringExtension.class)
// @DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
// public class BookDAOImplIntegrationTest {
//
//     private BookDAOimpl bookDAOimpl;
//     private AuthorDAOImpl authorDAOImpl;
//     
//     @Autowired
//     public BookDAOImplIntegrationTest(BookDAOimpl bookDAOimpl, AuthorDAOImpl authorDAOImpl) {
//         this.bookDAOimpl = bookDAOimpl;
//         this.authorDAOImpl = authorDAOImpl;
//     }
//
//     @Test
//     public void testThatBookCanBeCreatedAndRecalled() {
//         Author author = new Author(1L, "Churros", 9);
//         authorDAOImpl.create(author);
//         Book book = new Book("xxxyyyxx", "A random book", author.id());
//         bookDAOimpl.create(book);
//         Optional<Book> bookResult = bookDAOimpl.findOne(book.isbn());
//         System.out.println(bookResult.get().title());
//     }
//
//     @Test
//     public void testThatMultipleBooksCanBeCreatedAndRecalled() {
//         authorDAOImpl.create(new Author(1L, "Churros", 9));
//         authorDAOImpl.create(new Author(2L, "Churros Augusto", 9));
//         Book bookX = new Book("xxxxxxx", "Churros book 1", 1L);
//         Book bookY = new Book("yyyyyyy", "Churros book 2", 2L);
//         Book bookZ = new Book("zzzzzzz", "Churros book 3", 1L);
//         bookDAOimpl.create(new ArrayList<Book>(Arrays.asList(
//             bookX,
//             bookY,
//             bookZ
//         )));
//
//         List<Book> books = bookDAOimpl.findMany();
//         System.out.println(authorDAOImpl.findOne(books.get(1).authorId()).get().name());
//     }
//
//     @Test
//     public void testThatBookCanBeFullyUpdated() {
//         Author authorX = new Author(1L, "churros", 9);
//         authorDAOImpl.create(authorX);
//
//         Book bookX = new Book("xxxxxxx", "Churros book", authorX.id());
//         bookDAOimpl.create(bookX);
//
//         Book bookY = new Book("yyyyyyy", "Shoyou book", authorX.id());
//         bookDAOimpl.update("xxxxxxx", bookY);
//         List<Book> retrivedBook = bookDAOimpl.findMany();
//         System.out.println(retrivedBook);
//     }
//
// }
