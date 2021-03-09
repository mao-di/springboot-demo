package com.jiyun.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:JdbcCongig
 * Author:maodi
 * CreateTime:2021/03/02/19:38
 */
@Configuration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DruidDataSource dataSource() {
        return new DruidDataSource();
    }
}
