package com.javaIntro.SpringAppDatabase.database;

import javax.sql.DataSource;
import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PostgresDatabaseApplication implements CommandLineRunner {

    private final DataSource dataSource;
    private final Logger logger = Logger.getLogger(PostgresDatabaseApplication.class.getName());

    public PostgresDatabaseApplication(final DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

	public static void main(String[] args) {
		SpringApplication.run(PostgresDatabaseApplication.class, args);
	}
    
    @Override
    public void run(final String... args)
    {
       logger.info(dataSource.toString());
    }

}
