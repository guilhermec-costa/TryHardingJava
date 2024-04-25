package com.javaIntro.SpringAppDatabase.database.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaIntro.SpringAppDatabase.database.domain.Book;

/**
 * BookRepository
 */
@Repository
public interface BookRepository extends CrudRepository<Book, String> {
}
