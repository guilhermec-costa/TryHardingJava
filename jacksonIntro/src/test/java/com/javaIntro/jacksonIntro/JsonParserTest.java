package com.javaIntro.jacksonIntro;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonParserTest {

    private String sampleJsonString = "{ \"name\": \"Churros\"}";

    @Test
    public void testParse() throws IOException {
        JsonNode parseResult = JsonParser.fromJsonStringToJsonNode(sampleJsonString);
        assertEquals("Churros", parseResult.get("name").asText());
    }

    @Test
    public void fromJsonNodetoObject() throws IOException {
        JsonNode jsonNode = JsonParser.fromJsonStringToJsonNode(sampleJsonString);
        JSONTestModel data = JsonParser.fromJsonNodeToJavaObject(jsonNode, JSONTestModel.class);
        assertEquals("Churros", data.name());
    }
}
