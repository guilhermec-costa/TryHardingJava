package com.javaIntro.jacksonIntro;

import java.util.List;

/**
 * AuthorPOJO
 */
public record AuthorPOJO(
    String author,
    List<BooksPOJO> books
) {}
    
