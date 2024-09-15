package com.playhub.gameinitializer.model;

public record ValidationRules(
    Integer min,
    Integer max,
    Integer minLength,
    Integer maxLength,
    String pattern,
    Boolean notEmpty,
    Boolean notBlank
) {
}
