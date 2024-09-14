package com.playhub.gameinitializer.domain;

import com.playhub.gameinitializer.model.FieldType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldDetailsDocument {

    @Field("description")
    private String description;

    @Field("fieldType")
    private FieldType fieldType;

    @Field("validation")
    private ValidationRulesDocument validation;

    @Field("required")
    private Boolean required;

    @Field("defaultValue")
    private Object defaultValue;
}
