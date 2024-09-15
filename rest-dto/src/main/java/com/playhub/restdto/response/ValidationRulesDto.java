package com.playhub.restdto.response;

public record ValidationRulesDto(
    Integer min,
    Integer max,
    Integer minLength,
    Integer maxLength,
    String pattern,
    Boolean notEmpty,
    Boolean notBlank
) {
}
