package com.javaIntro.jacksonIntro;

import java.time.LocalDate;

public record BooksPOJO(
    String title,
    Boolean inPrint,
    LocalDate publishDate
) {}


