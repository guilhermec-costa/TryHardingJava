package com.javaIntro.jacksonIntro;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JsonParser
 */
public class JsonParser {
    private static ObjectMapper defaultObjectMapper = generateConfiguredObjectMapper();

    private static ObjectMapper generateConfiguredObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper;
    }

    public static JsonNode fromJsonStringToJsonNode(String json) throws IOException {
        return defaultObjectMapper.readTree(json);
    }

    public static <T> T fromJsonNodeToJavaObject(JsonNode jsonNode, Class<T> _class) throws JsonProcessingException {
        return defaultObjectMapper.treeToValue(jsonNode, _class);
    }
}
