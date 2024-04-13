package com.javaIntro.JDBCIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
            System.out.println("Hello world");
        } catch(SQLException error) {

            System.out.println(error.getMessage());
        }
    }
}
