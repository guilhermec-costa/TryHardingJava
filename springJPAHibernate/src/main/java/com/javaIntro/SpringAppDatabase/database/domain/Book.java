package com.javaIntro.SpringAppDatabase.database.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    private String isbn;
    private String title;

    @ManyToOne(targetEntity = Author.class, cascade = CascadeType.ALL)
    private Author author;
}
