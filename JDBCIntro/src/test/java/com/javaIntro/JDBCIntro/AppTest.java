package com.javaIntro.JDBCIntro;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
    private String connectionString = "jdbc:h2:mem:";
    Logger logger = Logger.getLogger("JDBCIntro");
    
    @Test
    public void establishH2DatabaseConnection()
    {
        try ( Connection databaseConnection = DriverManager.getConnection(connectionString)) {
            Boolean isConnectionValid = databaseConnection.isValid(0);
            assertEquals(true, isConnectionValid);
        } catch(SQLException error) {
            logger.info(error.getMessage());
        }
    }

    @Test
    public void getUserName() {
        try ( Connection databaseConnection = DriverManager.getConnection("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';")) {
            PreparedStatement preparedStatement = databaseConnection.prepareStatement("select * from users;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String name = resultSet.getString("name");
                assertEquals("Churros", name);
            }

        } catch(SQLException error) {
            System.out.println(error.getMessage());
        }
    }
}
