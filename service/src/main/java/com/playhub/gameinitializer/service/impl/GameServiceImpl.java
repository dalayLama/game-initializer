package com.playhub.gameinitializer.service.impl;

import com.playhub.gameinitializer.service.GameService;
import com.playhub.restdto.Game;
import com.playhub.restdto.response.GameInfo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Override
    public List<GameInfo> getGameInfos() {
        return Arrays.stream(Game.values())
            .map(GameInfo::new)
            .toList();
    }
}
