package com.javaIntro.SpringAppDatabase.database.mappers;

/**
 * Mapper
 */
public interface Mapper<A, B> {

    B mapTo(A a);

    A mapFrom(B b);

}
