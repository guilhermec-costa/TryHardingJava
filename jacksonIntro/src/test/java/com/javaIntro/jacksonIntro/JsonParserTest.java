package com.javaIntro.jacksonIntro;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonParserTest {

    private String sampleJsonString = "{ \"name\": \"Churros\", \"age\": 7}";
    private String dateJsonString = "{  \n" +
    "\"name\": \"Churros\", \n" +
    "\"age\": 7, \n" +
    "\"date\": \"2024-04-05\" \n" +
    "}";

    private String complexJsonString = "{\"author\":\"Churros Augusto\",\"books\":[{\"title\":\"title 1\",\"inPrint\":true,\"publishDate\":\"2024-02-10\"},{\"title\":\"title 2\",\"inPrint\":false,\"publishDate\":\"2023-01-01\"},{\"title\":\"title 3\",\"inPrint\":false,\"publishDate\":\"2022-05-15\"}]}";

    @Test
    public void testParse() throws IOException {
        JsonNode parseResult = JsonParser.fromJsonStringToJsonNode(sampleJsonString);
        assertEquals("Churros", parseResult.get("name").asText());
    }

    @Test
    public void fromJsonNodetoObject() throws IOException {
        JsonNode jsonNode = JsonParser.fromJsonStringToJsonNode(sampleJsonString);
        JSONTestModel data = JsonParser.fromJsonNodeToObject(jsonNode, JSONTestModel.class);
        assertEquals("Churros", data.name());
    }

    @Test
    public void testToJsonNode() {
        JSONTestModel jsonTestModel = new JSONTestModel("Churros");
        JsonNode jsonNode = JsonParser.fromObjectToJsonNode(jsonTestModel);
        assertEquals(jsonNode.get("name").asText(), "Churros");
    }

    @Test
    public void testFromObjectToJsonNode() throws JsonProcessingException {
        JSONTestModel jsonTestModel = new JSONTestModel("Churros");
        JsonNode jsonNode = JsonParser.fromObjectToJsonNode(jsonTestModel);
        String jsonString = JsonParser.fromJsonNodeToJsonString(jsonNode);
        System.out.println(jsonString);
    }

    @Test
    public void testPrettifyJsonString() throws JsonProcessingException {
        JSONTestModel jsonTestModel = new JSONTestModel("Churros");
        System.out.println(dateJsonString);
        JsonNode jsonNode = JsonParser.fromObjectToJsonNode(jsonTestModel);
        String formmatedJsonString = JsonParser.prettifyJsonNode(jsonNode);
    }

    @Test
    public void testJsonWithDateField() throws Exception {
        JsonNode jsonNode = JsonParser.fromJsonStringToJsonNode(dateJsonString);
        DatePOJO datePOJO = JsonParser.fromJsonNodeToObject(jsonNode, DatePOJO.class);
        assertEquals("2024-04-05", datePOJO.date().toString());
    }

    @Test
    public void testComplexJson() throws Exception {
        JsonNode jsonNode = JsonParser.fromJsonStringToJsonNode(complexJsonString);
        AuthorPOJO authorPOJO = JsonParser.fromJsonNodeToObject(jsonNode, AuthorPOJO.class);
        System.out.println(authorPOJO.author());
        for(BooksPOJO book : authorPOJO.books()) {
            String formmatedBookString = String.format("%s - %s - %s", 
                book.title(), book.publishDate(), book.inPrint());
            System.out.println(formmatedBookString);
        }
    }
}
