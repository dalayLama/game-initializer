package com.playhub.gameinitializer.model;

public record FieldDetails(
    String description,
    FieldType fieldType,
    ValidationRules validation,
    Boolean required,
    Object defaultValue
) {
}
