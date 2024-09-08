package com.playhub.restdto.response;

public record FieldDetailsDto(
    String description,
    FieldType fieldType,
    ValidationRulesDto validation,
    Boolean required,
    Object defaultValue
) {
}
