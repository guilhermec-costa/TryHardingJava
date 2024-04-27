package com.javaIntro.SpringAppDatabase.database.mappers.impl;

import com.javaIntro.SpringAppDatabase.database.domain.dto.AuthorDTO;
import com.javaIntro.SpringAppDatabase.database.domain.entities.Author;
import com.javaIntro.SpringAppDatabase.database.mappers.Mapper;

/**
 * AuthorMapper
 */
public class AuthorMapper implements Mapper<Author, AuthorDTO> {

    @Override
    public Author mapFrom(AuthorDTO b) {
        return null;
    }

    @Override
    public AuthorDTO mapTo(Author a) {
        return null;
    }

    
}
