package com.xry.studygit.mongo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.xry.studygit.mongo.repo.ggdb",
        mongoTemplateRef = GGMongoConfig.MONGO_TEMPLATE)
public class GGMongoConfig {
    protected static final String MONGO_TEMPLATE = "ggMongoTemplate";
}
