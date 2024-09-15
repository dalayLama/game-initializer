package com.playhub.gameinitializer.repository;

import com.playhub.gameinitializer.domain.GameInfoDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameInfoRepository extends MongoRepository<GameInfoDocument, String> {
}
