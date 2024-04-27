package com.javaIntro.SpringAppDatabase.database.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaIntro.SpringAppDatabase.database.domain.dto.AuthorDTO;
import com.javaIntro.SpringAppDatabase.database.domain.entities.Author;
import com.javaIntro.SpringAppDatabase.database.mappers.Mapper;
import com.javaIntro.SpringAppDatabase.database.mappers.impl.AuthorMapper;
import com.javaIntro.SpringAppDatabase.database.services.AuthorService;

/**
 * AuthorController
 */
@RestController
public class AuthorController {

    private final AuthorService authorService;
    private final Mapper<Author, AuthorDTO> authorMapper;

    @Autowired
    public AuthorController(AuthorService authorService, Mapper<Author, AuthorDTO> authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @PostMapping(path = "/authors")
    public AuthorDTO createAuthor(@RequestBody AuthorDTO authorDTO) {
        // automatically converts the json body to a author model via jackson
        // presentation layer (this one) must not have knowledge about the persistence
        // layer.
        // so it doen not make sense to use entities here
        // The presentation layer must be decoupled from the persistence layer

        Author author = authorMapper.mapFrom(authorDTO);
        Author persistedAuthor = authorService.createAuthor(author);
        return authorMapper.mapTo(persistedAuthor);
    }
}
