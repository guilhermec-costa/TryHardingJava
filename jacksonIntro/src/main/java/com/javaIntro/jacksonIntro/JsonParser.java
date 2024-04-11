package com.javaIntro.jacksonIntro;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonParser {
    private static ObjectMapper defaultObjectMapper = generateConfiguredObjectMapper();

    private static ObjectMapper generateConfiguredObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }

    public static JsonNode fromJsonStringToJsonNode(String json) throws IOException {
        return defaultObjectMapper.readTree(json);
    }

    public static <T> T fromJsonNodeToObject(JsonNode jsonNode, Class<T> _class) throws JsonProcessingException {
        return defaultObjectMapper.treeToValue(jsonNode, _class);
    }

    public static JsonNode fromObjectToJsonNode(Object object) {
        return defaultObjectMapper.valueToTree(object);
    }

    public static String fromJsonNodeToJsonString(JsonNode jsonNode) throws JsonProcessingException  {
        ObjectWriter objectWriter = defaultObjectMapper.writer();
        return objectWriter.writeValueAsString(jsonNode);
    }

    public static String prettifyJsonNode(JsonNode jsonNode) throws JsonProcessingException {
        ObjectWriter objectWriter = defaultObjectMapper.writer();
        objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
        return objectWriter.writeValueAsString(jsonNode);
    }
}
