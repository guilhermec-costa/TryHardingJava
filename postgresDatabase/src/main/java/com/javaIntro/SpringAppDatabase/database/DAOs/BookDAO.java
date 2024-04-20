package com.javaIntro.SpringAppDatabase.database.DAOs;

import java.util.Optional;

import com.javaIntro.SpringAppDatabase.database.domain.Book;

public interface BookDAO {
   public void create(Book book); 
   public Optional<Book> findOne(String isbn);
}
