package com.javaIntro.SpringAppDatabase.database.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    
    @Bean
    public JdbcTemplate jdbcTemplate(final DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }
}
