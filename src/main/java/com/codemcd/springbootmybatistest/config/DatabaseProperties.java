package com.codemcd.springbootmybatistest.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DatabaseProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private int initialSize;
    private int maxActive;
    private int maxIdle;
    private int minIdle;
    private int maxWait;

    private String validationQuery;
    private boolean testOnBorrow;
    private int validationInterval;
    private boolean defaultAutoCommit;
}
