package com.javaIntro.jacksonIntro;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonParser {
    private static ObjectMapper objectMapper = generateConfiguredObjectMapper();

    private static ObjectMapper generateConfiguredObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }

    public static JsonNode fromJsonStringToJsonNode(String json) throws IOException {
        return objectMapper.readTree(json);
    }

    public static <T> T fromJsonNodeToObject(JsonNode jsonNode, Class<T> _class) throws JsonProcessingException {
        return objectMapper.treeToValue(jsonNode, _class);
    }

    public static JsonNode fromObjectToJsonNode(Object object) {
        return objectMapper.valueToTree(object);
    }

    public static String fromJsonNodeToJsonString(JsonNode jsonNode) throws JsonProcessingException  {
        return generateString(jsonNode, false);
    }

    public static String prettifyJsonNode(JsonNode jsonNode) throws JsonProcessingException {
        return generateString(jsonNode, true);
    }

    private static String generateString(JsonNode jsonNode, Boolean shouldPrettify) throws JsonProcessingException {
        ObjectWriter objectWriter = objectMapper.writer();
        if(shouldPrettify) objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
        return objectWriter.writeValueAsString(jsonNode);
    }

}
