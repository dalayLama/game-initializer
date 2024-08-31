package com.playhub.restdto.response;

import com.playhub.restdto.Game;

public record GameInfo(
    String gameCode,
    String gameName,
    String gameDescription
) {
    public GameInfo(Game game) {
        this(game.gameCode, game.gameName, game.gameDescription);
    }
}
