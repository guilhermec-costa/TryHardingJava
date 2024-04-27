package com.javaIntro.SpringAppDatabase.database.services;

import com.javaIntro.SpringAppDatabase.database.domain.dto.AuthorDTO;
import com.javaIntro.SpringAppDatabase.database.domain.entities.Author;

/**
 * AuthorService
 */
public interface AuthorService {
    Author createAuthor(Author author);

}
