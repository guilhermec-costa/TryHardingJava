package com.javaIntro.SpringAppDatabase.database.DAOs;

import java.util.List;
import java.util.Optional;

import com.javaIntro.SpringAppDatabase.database.domain.Book;

public interface BookDAO {
   public void create(Book book); 
   public void create(List<Book> books);
   public Optional<Book> findOne(String isbn);
   public List<Book> findMany();
}
