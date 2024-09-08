package com.playhub.gameinitializer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Getter
@Document("game-info")
@NoArgsConstructor
@AllArgsConstructor
public class GameInfoDocument {
    @Id
    private String code;
    private String name;
    private String description;
    private Map<String, FieldDetailsDocument> initializationConfig;
}
