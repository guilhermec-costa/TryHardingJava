package com.javaIntro.lombokIntro.domain;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A Book written by an {@link LombokAuthor}.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookLombok {

    private String title;
    private Integer yearPublished;
    private LombokAuthor author;

}
