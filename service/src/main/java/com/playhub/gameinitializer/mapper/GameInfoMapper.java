package com.playhub.gameinitializer.mapper;

import com.playhub.gameinitializer.domain.FieldDetailsDocument;
import com.playhub.gameinitializer.domain.GameInfoDocument;
import com.playhub.gameinitializer.model.FieldDetails;
import com.playhub.gameinitializer.model.GameInfo;
import com.playhub.restdto.response.FieldDetailsDto;
import com.playhub.restdto.response.GameInfoDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GameInfoMapper {

    GameInfo toGameInfo(GameInfoDocument gameInfoDocument);

    GameInfoDto toGameInfoDto(GameInfo gameInfo);

    List<GameInfoDto> toGameInfoDtoList(List<GameInfo> gameInfo);

    List<FieldDetails> toFieldDetailsList(List<FieldDetailsDocument> fieldDetailsDocuments);

    List<FieldDetailsDto> toFieldDetailsDtoList(List<FieldDetails> fieldDetailsDocuments);
}
