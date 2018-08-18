package com.xry.studygit.mongo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.xry.studygit.mongo.repo.mmdb",
        mongoTemplateRef = MMMongoConfig.MONGO_TEMPLATE)
public class MMMongoConfig {
    protected static final String MONGO_TEMPLATE = "mmMongoTemplate";
}
