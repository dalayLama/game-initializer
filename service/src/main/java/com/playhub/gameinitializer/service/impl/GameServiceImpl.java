package com.playhub.gameinitializer.service.impl;

import com.playhub.gameinitializer.mapper.GameInfoMapper;
import com.playhub.gameinitializer.model.GameInfo;
import com.playhub.gameinitializer.repository.GameInfoRepository;
import com.playhub.gameinitializer.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameInfoRepository gameInfoRepository;
    private final GameInfoMapper gameInfoMapper;

    @Override
    @Transactional(readOnly = true)
    public List<GameInfo> getGameInfos() {
        return gameInfoRepository.findAll().stream()
            .map(gameInfoMapper::toGameInfo)
            .toList();
    }
}
