package com.javaIntro.lombokIntro;

import com.javaIntro.lombokIntro.domain.LombokAuthor;


/**
 * DataUtil
 */
public final class DataUtil {

    private DataUtil() {}
    public static LombokAuthor createTestAuthor() {
        return LombokAuthor.builder()
            .givenName("Churros")
            .familyName("Churros family")
            .age(9)
            .build();
    }
}
