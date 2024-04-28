package com.javaIntro.SpringAppDatabase.database.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AuthorDTO
 * a POJO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDTO {

    private Long id;
    private String name;
    private Integer age;
}
