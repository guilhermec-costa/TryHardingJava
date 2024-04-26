package com.javaIntro.SpringAppDatabase.database.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaIntro.SpringAppDatabase.database.domain.Author;

/**
 * AuthorRepository
 * Intermediates the persistence mecanism and the domain model
 * It must return all the cluster contained within a aggregate
 */
@Repository
// @Repository mark the class as a bean, so it can be injected in others parts
public interface AuthorRepository extends CrudRepository<Author, Long> {
    Iterable<Author> ageLessThan(int age);
        
    // HQL
    @Query("select a from Author a where a.age > ?1")
    Iterable<Author> findWithAgeGreaterThan(int age);
}
