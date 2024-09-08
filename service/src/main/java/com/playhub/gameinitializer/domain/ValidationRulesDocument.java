package com.playhub.gameinitializer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidationRulesDocument {
    private Integer min;
    private Integer max;
    private Integer minLength;
    private Integer maxLength;
    private String pattern;
    private Boolean notEmpty;
    private Boolean notBlank;
}
