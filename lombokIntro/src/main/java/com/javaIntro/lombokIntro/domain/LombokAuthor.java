package com.javaIntro.lombokIntro.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * LombokAuthor
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
// @Data: includes @Setter, @Getter, @ToString, @EqualsAndHashCode
public class LombokAuthor {

    private String givenName;
    private String familyName;
    private Integer age;

}
