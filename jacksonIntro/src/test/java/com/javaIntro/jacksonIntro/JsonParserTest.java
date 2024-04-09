package com.javaIntro.jacksonIntro;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * JsonParserTest
 */
public class JsonParserTest {

    @Test
    public void testParse() throws IOException {
        String json = "{ \"name\": \"Churros\"}";
        JsonNode parseResult = JsonParser.parse(json);
        assertEquals("Churros", parseResult.get("name").asText());
    }
}
