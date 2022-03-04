package com.springDemo.springPerson.datasource;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app.datasource")
public class PostgresDatasource {

    public HikariDataSource hikariDataSource(){
        return DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
    }

}
