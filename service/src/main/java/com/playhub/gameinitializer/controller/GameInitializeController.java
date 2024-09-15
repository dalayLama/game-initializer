package com.playhub.gameinitializer.controller;

import com.playhub.gameinitializer.mapper.GameInfoMapper;
import com.playhub.gameinitializer.model.GameInfo;
import com.playhub.gameinitializer.service.GameService;
import com.playhub.restdto.ApiPaths;
import com.playhub.restdto.response.GameInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GameInitializeController {

    private final GameService gameService;
    private final GameInfoMapper gameInfoMapper;

    @GetMapping(ApiPaths.V1_GAMES)
    public ResponseEntity<List<GameInfoDto>> games() {
        List<GameInfo> gameInfos = gameService.getGameInfos();
        return ResponseEntity.ok(gameInfoMapper.toGameInfoDtoList(gameInfos));
    }
}
