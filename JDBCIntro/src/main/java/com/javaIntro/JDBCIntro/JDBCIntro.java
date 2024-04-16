package com.javaIntro.JDBCIntro;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;

public class JDBCIntro 
{

    public static void main( String[] args ) throws Exception
    {
        DataSource dataSource = createDataSource();
        System.out.println(System.getProperty("java.classpath"));

        // try ( Connection connection = dataSource.getConnection()) {
        //     System.out.println(connection.isValid(0));
        // } catch(SQLException error) {
        //     // System.out.println(error.getMessage());
        //     // System.out.println(error.getStackTrace());
        // }
    }

    private static DataSource createDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:users.sql';");
        return dataSource;
    }
}
