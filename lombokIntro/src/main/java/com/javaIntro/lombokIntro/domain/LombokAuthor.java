package com.javaIntro.lombokIntro.domain;

import lombok.Getter;
import lombok.Setter;
/**
 * LombokAuthor
 */
public class LombokAuthor {

    @Getter
    @Setter
    private String givenName;

    @Getter
    @Setter
    private String familyName;
    
    @Getter
    @Setter
    private Integer age;

    public LombokAuthor(String givenName, String familyName, Integer age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.age = age;
    }

}
