package com.javaIntro.SpringAppDatabase.database.DAOs;

import java.util.List;
import java.util.Optional;

import com.javaIntro.SpringAppDatabase.database.domain.Author;

public interface AuthorDAO {
    void create(Author author);
    void create(List<Author> authors);
    Optional<Author> findOne(Long id);
    List<Author> findMany();
}
