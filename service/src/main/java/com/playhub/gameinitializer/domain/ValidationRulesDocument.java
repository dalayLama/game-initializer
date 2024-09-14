package com.playhub.gameinitializer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidationRulesDocument {

    @Field("min")
    private Integer min;

    @Field("max")
    private Integer max;

    @Field("minLength")
    private Integer minLength;

    @Field("maxLength")
    private Integer maxLength;

    @Field("pattern")
    private String pattern;

    @Field("notEmpty")
    private Boolean notEmpty;

    @Field("notBlank")
    private Boolean notBlank;
}
