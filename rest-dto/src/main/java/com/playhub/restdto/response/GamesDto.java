package com.playhub.restdto.response;

import java.util.List;

public record GamesDto (
    List<GameInfo> gameInfos
) {
}
