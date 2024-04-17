package com.javaIntro.SpringAppDatabase.database;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

    private final DataSource dataSource;
    private final Logger logger = Logger.getLogger(DatabaseApplication.class.getName());

    public DatabaseApplication(final DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

    @Override
    public void run(final String... args)
    {
        logger.info(dataSource.toString());
        final JdbcTemplate restTemplate = new JdbcTemplate(this.dataSource);
        restTemplate.execute("select 1");
    }
}
