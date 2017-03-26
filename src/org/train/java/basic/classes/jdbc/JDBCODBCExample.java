package org.train.java.basic.classes.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by javat on 3/25/2017.
 */
public class JDBCODBCExample {
    public static void main(String[] args)
    {
        try
        {
            //Type 1 - JDBC_ODBC Driver -- 1.8 -- 1.7
            //Type 2 - JDBC Native Driver -- C, C++ (OCI -- )
            // Type 3 - JDBC Net Driver --
            // Type 4 -- Java 100% Java - Java -- Driver
            Class driverClass = Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // Explicitly tell driver manager that this driver exist in JVM
//            DriverManager.registerDriver((Driver)driverClass.newInstance());
            Connection connection = DriverManager.getConnection("jdbc:odbc:MYSQL_RES");
            System.out.printf("Connection established.." + connection);
            connection.close();
        }
        catch (SQLException | ClassNotFoundException  e)
        {
          e.printStackTrace();
        }
    }

}
