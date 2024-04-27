package com.javaIntro.SpringAppDatabase.database;

import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestAuthorA;
/**
 * JacksonTests
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaIntro.SpringAppDatabase.database.domain.entities.Author;
import com.javaIntro.SpringAppDatabase.database.domain.entities.Book;

public class JacksonTests {

    private static Logger logger = Logger.getLogger(JacksonTests.class.getName());

    @Test
    public void testThatObjectMapperCanCreateJsonStringFromAuthorObject() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Author author = createTestAuthorA();

        // from java object to json string
        String jsonString = objectMapper.writeValueAsString(author);
        assertEquals("{\"id\":1,\"name\":\"Churros 1\",\"currentAge\":7}", jsonString);
    }

    @Test
    public void testThatObjectMapperCanCreateAuthorObjectFromJsonString()
            throws JsonMappingException, JsonProcessingException {
        final ObjectMapper objectMapper = new ObjectMapper();
        final Author authorToCompare = createTestAuthorA();
        String jsonString = "{\"foo\": \"bar\",\"id\":1,\"name\":\"Churros 1\",\"currentAge\":7}";

        // from json string to java object
        Author author = objectMapper.readValue(jsonString, Author.class);
        assertEquals(authorToCompare, author);
    }

    @Test
    public void testThatObjectMapperCanCreateBookObjectFromJsonString()
            throws JsonMappingException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String bookJsonString = "{\"isbn\":\"145-xxy-qsa-347-92\",\"title\":\"Randomtitle\",\"author\":{\"id\":1,\"name\":\"Churros\",\"age\":9}}";
        Book book = objectMapper.readValue(bookJsonString, Book.class);
        assertEquals(true, true);
    }
}
