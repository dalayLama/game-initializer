package com.playhub.gameinitializer.service;

import com.playhub.restdto.response.GameInfo;

import java.util.List;

/**
 * Сервис для получения ин-фы об играх.
 */
public interface GameService {

    /**
     * Метод получения списка игр с их информацией.
     * @return список игр.
     */
    List<GameInfo> getGameInfos();
}
