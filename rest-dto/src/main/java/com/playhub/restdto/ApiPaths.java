package com.playhub.restdto;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ApiPaths {

    public static final String V1 = "/api/v1";

    public static final String V1_GAMES = V1 + "/games";

    public static final String INTERNAL_V1 = "/internal" + V1;
}
