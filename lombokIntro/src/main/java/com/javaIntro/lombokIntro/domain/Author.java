package com.javaIntro.lombokIntro.domain;

import java.util.Objects;

/**
 * Author
 */
public class Author {

    private String givenName;
    private String familyName;
    private Integer age;

    public Author(String givenName, String familyName, Integer age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.age = age;
    }

    public Author() {
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(givenName, author.givenName) && Objects.equals(familyName, author.familyName) && Objects.equals(age, author.age);
    }

    @Override
    public String toString() {
        return "Author [givenName=" + givenName + ", familyName=" + familyName + ", age=" + age + "]";
    }

}
