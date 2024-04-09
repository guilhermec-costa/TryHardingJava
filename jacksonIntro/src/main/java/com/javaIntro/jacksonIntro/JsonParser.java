package com.javaIntro.jacksonIntro;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JsonParser
 */
public class JsonParser {
    private static ObjectMapper defaultObjectMapper = new ObjectMapper();

    private static ObjectMapper generateConfiguredObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper;
    }
}
