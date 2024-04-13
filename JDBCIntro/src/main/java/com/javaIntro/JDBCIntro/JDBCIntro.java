package com.javaIntro.JDBCIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Hello world!
 *
 */
public class JDBCIntro 
{
    public static void main( String[] args ) throws Exception
    {   
        try ( Connection connection = DriverManager.getConnection("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';")) {
            PreparedStatement initialPreparedStatement = connection.prepareStatement("select * from users;");
            ResultSet users = initialPreparedStatement.executeQuery();
            while(users.next()) {
                String name = users.getString("name");
                Integer id = users.getInt("id");
                System.out.println(name + " | " + id);
            }
        } catch(SQLException error) {

            System.out.println(error.getMessage());
        }
    }
}
