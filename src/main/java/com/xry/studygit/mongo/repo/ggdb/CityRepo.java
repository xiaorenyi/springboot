package com.xry.studygit.mongo.repo.ggdb;

import com.xry.studygit.mongo.entity.CityDO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepo extends MongoRepository<CityDO,String>{
}
