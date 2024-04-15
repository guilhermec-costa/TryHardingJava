package com.javaIntro.JDBCIntro;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
{   
    private String connectionString;
    private Connection databaseConnection;
    private Logger logger;
    
    @Before
    public void initialize() 
    {
        this.connectionString = "jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';";
        this.logger = Logger.getLogger("JDBCIntro");

        try {
            this.databaseConnection = DriverManager.getConnection(connectionString);
        } catch(SQLException error) {
            logger.info(error.getMessage());
        }
    }

    @After
    public void finalize() throws SQLException
    {
        this.databaseConnection.close();
    }

    @Test
    public void establishH2DatabaseConnection() throws SQLException
    {   
        Boolean isConnectionValid = this.databaseConnection.isValid(0);
        assertEquals(true, isConnectionValid);
    }

    @Test
    public void getUserName() throws SQLException
    {
        PreparedStatement preparedStatement = this.databaseConnection.prepareStatement("select * from users;");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            String name = resultSet.getString("name");
            assertEquals("Churros", name);
        }
    }

    @Test
    public void getUserById() throws SQLException 
    {
        PreparedStatement preparedStatement = this.databaseConnection.prepareStatement("select * from users where id = ?");
        preparedStatement.setInt(1, 1);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            String userName = resultSet.getString("name");
            assertEquals("Churros", userName);
        }
    }

    @Test
    public void getUserId() throws SQLException
    {
        PreparedStatement preparedStatement = this.databaseConnection.prepareStatement("select * from users;");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            int userId = resultSet.getInt("id");
            // assertEquals(1, userId);
        }
    }

    @Test
    public void insertOneRow() throws SQLException 
    {
        PreparedStatement preparedStatement = this.databaseConnection.
                                                prepareStatement("insert into users (name) values (?);");

        preparedStatement.setString(1, "Shoyou");
        int numberOfRowsInserted = preparedStatement.executeUpdate();
        assertEquals(1, numberOfRowsInserted);
    }

    @Test
    public void updateOneRow() throws SQLException
    {
        PreparedStatement preparedStatement = this.databaseConnection.
            prepareStatement("update users set name = ? where id = ?");

        preparedStatement.setString(1, "Churros Augusto");
        preparedStatement.setInt(2, 1);
        int updateCount = preparedStatement.executeUpdate();
        assertEquals(1, updateCount);
    }

    @Test
    public void deleteOneRow() throws SQLException {
        PreparedStatement preparedStatement = this.databaseConnection.prepareStatement("delete from users where id = ?");
        preparedStatement.setInt(1, 1);
        int deletedCount = preparedStatement.executeUpdate();
        System.out.println(deletedCount);
        assertEquals(1, deletedCount);
    }
}
