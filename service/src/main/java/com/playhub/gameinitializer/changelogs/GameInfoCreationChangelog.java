package com.playhub.gameinitializer.changelogs;

import com.playhub.gameinitializer.domain.FieldDetailsDocument;
import com.playhub.gameinitializer.domain.GameInfoDocument;
import com.playhub.gameinitializer.domain.ValidationRulesDocument;
import com.playhub.gameinitializer.model.FieldType;
import com.playhub.gameinitializer.repository.GameInfoRepository;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Map;

@ChangeUnit(id = "GameInfoCreationChangelog", order = "1", author = "SttDmitry")
public class GameInfoCreationChangelog {

    @Execution
    public void createGameInfo(GameInfoRepository repository) {
        GameInfoDocument boggleInfo = new GameInfoDocument(
            "Boggle",
            "Боггл",
            "Настольная игра, в которой составляют слова из имеющихся букв",
            getBoggleInitializationConfig()
        );
        repository.save(boggleInfo);
    }

    @RollbackExecution
    public void rollback() {
    }

    private Map<String, FieldDetailsDocument> getBoggleInitializationConfig() {
        return Map.of(
            "playersCount", FieldDetailsDocument.builder()
                .description("Требуемое кол-во игроков")
                .fieldType(FieldType.INTEGER)
                .validation(ValidationRulesDocument.builder().min(2).max(4).build())
                .required(false)
                .defaultValue(2)
                .build(),
            "matrixSize", FieldDetailsDocument.builder()
                .description("Размер игровой сетки")
                .fieldType(FieldType.INTEGER)
                .validation(ValidationRulesDocument.builder().min(4).max(10).build())
                .required(false)
                .defaultValue(4)
                .build(),
            "rounds", FieldDetailsDocument.builder()
                .description("Количество раундов")
                .fieldType(FieldType.INTEGER)
                .validation(ValidationRulesDocument.builder().min(1).max(10).build())
                .required(false)
                .defaultValue(3)
                .build(),
            "roundTime", FieldDetailsDocument.builder()
                .description("Время длительности раунда")
                .fieldType(FieldType.DURATION)
                .validation(ValidationRulesDocument.builder().notEmpty(true).build())
                .required(false)
                .defaultValue(Duration.of(1, ChronoUnit.MINUTES))
                .build()
        );
    }
}
