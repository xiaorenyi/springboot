package com.xry.studygit.mongo.config.property;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BaseMongoProperties {

    private String database;

    private String username;

    private String password;

    private String host;

    private Integer port;
}
