package com.javaIntro.SpringAppDatabase.database.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaIntro.SpringAppDatabase.database.domain.dto.AuthorDTO;
import com.javaIntro.SpringAppDatabase.database.domain.entities.Author;
import com.javaIntro.SpringAppDatabase.database.mappers.Mapper;

/**
 * AuthorMapper
 */
@Component
public class AuthorMapper implements Mapper<Author, AuthorDTO> {

    private ModelMapper modelMapper;

    @Autowired
    public AuthorMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public Author mapFrom(AuthorDTO authorDTO) {
        return modelMapper.map(authorDTO, Author.class);
    }

    @Override
    public AuthorDTO mapTo(Author author) {
        return modelMapper.map(author, AuthorDTO.class);
    }

}
