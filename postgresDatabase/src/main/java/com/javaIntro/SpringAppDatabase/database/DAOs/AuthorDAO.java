package com.javaIntro.SpringAppDatabase.database.DAOs;

import java.util.Optional;

import com.javaIntro.SpringAppDatabase.database.domain.Author;

public interface AuthorDAO {
    void create(Author author);
    Optional<Author> findOne(Long id);
}
