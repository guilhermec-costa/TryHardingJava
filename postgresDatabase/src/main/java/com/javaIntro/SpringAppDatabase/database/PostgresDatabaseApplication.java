package com.javaIntro.SpringAppDatabase.database;

import javax.sql.DataSource;
import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaIntro.SpringAppDatabase.database.domain.Author;

@SpringBootApplication
public class PostgresDatabaseApplication implements CommandLineRunner {

    /*
     *  DAO: Data Access Object
     *
     *  It is between the persistency layer and the service layer
     *  Through them that it is possible to access database tables
     * */

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
       logger.info("Datasource: " + dataSource.toString());
    }

}
