package com.playhub.gameinitializer.controller;

import com.playhub.gameinitializer.service.GameService;
import com.playhub.restdto.ApiPaths;
import com.playhub.restdto.response.GamesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class GameInitializeController {

    private final GameService gameService;

    @GetMapping(ApiPaths.V1_GAMES)
    public ResponseEntity<GamesDto> games() {
        return Optional.ofNullable(gameService.getGameInfos())
            .map(GamesDto::new)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.noContent().build());
    }
}
