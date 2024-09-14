package com.playhub.gameinitializer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

@Getter
@Document("game-info")
@NoArgsConstructor
@AllArgsConstructor
public class GameInfoDocument {

    @Id
    @Field("code")
    private String code;

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("initializationConfig")
    private Map<String, FieldDetailsDocument> initializationConfig;
}
