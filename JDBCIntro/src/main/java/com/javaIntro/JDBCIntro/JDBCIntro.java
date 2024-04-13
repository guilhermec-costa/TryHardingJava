package com.javaIntro.JDBCIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
/**
 * Hello world!
 *
 */
public class JDBCIntro 
{
    public static void main( String[] args ) throws Exception
    {   
        try ( Connection connection = DriverManager.getConnection("jdbc:h2:mem:")) {
            System.out.println(connection.isValid(0));
        } catch(SQLException error) {

            System.out.println(error.getMessage());
        }
    }
}
