package dev.ranieri.repos;

import dev.ranieri.entities.Score;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepo extends MongoRepository<Score,String> {


}
