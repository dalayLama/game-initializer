package com.playhub.gameinitializer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldDetailsDocument {
    private String description;
    private FieldTypeDocument fieldType;
    private ValidationRulesDocument validation;
    private Boolean required;
    private Object defaultValue;
}
