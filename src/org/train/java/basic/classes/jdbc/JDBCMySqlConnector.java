package org.train.java.basic.classes.jdbc;

import java.sql.*;

/**
 * Created by javat on 3/25/2017.
 */
public class JDBCMySqlConnector {


    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {

            //Type 1 - JDBC_ODBC Driver

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantmenu", "ramu", "ram123");
            System.out.println("Connection string is" + connection.toString());
            statement = connection.createStatement();
            connection.commit();
            connection.rollback();
            rs = statement.executeQuery("select * from om_restaurants");
            if(rs != null )
            {
                while (rs.next())
                {
                    System.out.println(rs.getString(1) + " " + rs.getString(2));
                }
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                rs.close();
                statement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
