package com.playhub.restdto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Game {

    BOGGLE("BOGGLE", "Boggle", "The Game");

    public final String gameCode;
    public final String gameName;
    public final String gameDescription;
}
