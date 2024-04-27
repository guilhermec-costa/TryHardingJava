package com.javaIntro.SpringAppDatabase.database;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaIntro.SpringAppDatabase.database.domain.Author;
import com.javaIntro.SpringAppDatabase.database.repositories.AuthorRepository;
import com.javaIntro.SpringAppDatabase.database.services.AuthorService;

/**
 * AuthorController
 */
@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping(path = "/authors")
    public Author createAuthor(@RequestBody Author author) {
        // automatically converts the json body to a author model via jackson
        // the presentation layer (this one) must not have knowledge about the persistence layer.
        // so it doen not make sense to use entities here
        // The presentation layer must be decoupled from the persistence layer
        return authorService.createAuthor(author);
    }
}
