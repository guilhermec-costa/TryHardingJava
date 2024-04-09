package com.javaIntro.jacksonIntro;

import com.fasterxml.jackson.databind.JsonNode;

public class App {
    public static void main(String[] args) {
        String json = "{ \"name\": \"Churros\"}";

        try {
            JsonNode parseResult = JsonParser.parse(json);
            System.out.println(parseResult.get("name").asText());
        } catch(Exception error) {
            System.out.println(error.getMessage());
        }
    }
    
}
