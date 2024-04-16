package com.javaIntro.JDBCIntro;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.zaxxer.hikari.HikariDataSource;

public class JDBCIntro 
{

    public static void main( String[] args ) throws Exception
    {
        DataSource dataSource = createDataSource();
        try ( Connection connection = dataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id = ?;");
            
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                final String name = resultSet.getString("name");
                System.out.println(name);
            }

        } catch(SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    private static DataSource createDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';");
        return dataSource;
    }
}
