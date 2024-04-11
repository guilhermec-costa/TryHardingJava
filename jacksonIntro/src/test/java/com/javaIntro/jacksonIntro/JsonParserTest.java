package com.javaIntro.jacksonIntro;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonParserTest {

    private String sampleJsonString = "{ \"name\": \"Churros\", \"age\": 7}";

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
        JsonNode jsonNode = JsonParser.fromObjectToJsonNode(jsonTestModel);
        String formmatedJsonString = JsonParser.prettifyJsonNode(jsonNode);
        System.out.println(formmatedJsonString);
    }
}
