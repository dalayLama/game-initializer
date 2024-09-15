package com.playhub.restdto.response;

public record FieldDetailsDto(
    String description,
    FieldTypeDto fieldType,
    ValidationRulesDto validation,
    Boolean required,
    Object defaultValue
) {
}
