package org.train.java.basic.classes.jdbc;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.sql.*;
import java.util.Map;

/**
 * Created by javat on 3/25/2017.
 */
public class JDBCMySqlConnector {


    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantmenu", "ramu", "ram123");
//                        dropTable(connection);
//            createTable(connection);
//            insertIntoTable(connection);
//            insertIntoTable(connection, 200,"laxman", "Second");
//            insertIntoTable(connection, 400,"Rocky", "Second");
//            insertIntoTable(connection, 500,"John", "Second");
//            insertIntoTable(connection, 600,"Dave", "Second");
//            queryTable(connection);
//            queryTableWithScroll(connection);
//            queryTablerWithSP(connection,"Rocky");
//            queryTablerWithSP(connection,"Raju");
//            queryTablerWithSP(connection,"laxman");
            dbMetadData(connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createTable(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.execute("create table student(studentNumber int, studentName varchar(100), className varchar(30))");
        System.out.println("Table got created " );
        stmt.close();
    }

    public static void dropTable(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.execute("drop table student");
        System.out.println("Table got dropped " );
        stmt.close();
    }

    public static void insertIntoTable(Connection conn) throws SQLException {
        conn.setAutoCommit(false);
        Statement stmt = conn.createStatement();


        stmt.executeUpdate("insert into student values(12,'Raju', 'Seven')");
        stmt.executeUpdate("insert into student values(22,'Raju', 'Seven')");

        Savepoint savepoint = conn.setSavepoint("twoRecords");

        stmt.executeUpdate("insert into student values(32,'Raju', 'Seven')");
        stmt.executeUpdate("insert into student values(42,'Raju', 'Seven')");
        stmt.executeUpdate("insert into student values(52,'Raju', 'Seven')");

//        int[] result = stmt.executeBatch();
//        System.out.println("Results inserted " + result.length);

        stmt.close();
//        conn.rollback(savepoint);
        conn.rollback();


        conn.commit();

    }

    public static void dbMetadData(Connection conn) throws SQLException {
        DatabaseMetaData db = conn.getMetaData();

        System.out.printf("Metadata....");
        System.out.println(db.getDatabaseMajorVersion());
        System.out.println(db.getDatabaseProductName());

        ResultSet rs = db.getCatalogs();
        ResultSetMetaData rsMetaData = rs.getMetaData();
        System.out.println(db.getDriverName());
        while(rs.next())
        {
            System.out.println("The values are " + rs.getString(1));
        }
    }

    public static void insertIntoTable(Connection conn, int number, String name, String className) throws SQLException {
        conn.setAutoCommit(false);
        PreparedStatement stmt = conn.prepareStatement("insert into student values(?, ?, ?)");
        //SQL injection can be avoided using prepared statement
        stmt.setInt(1, number);
        stmt.setString(2, name);
        stmt.setString(3, className);
        int count = stmt.executeUpdate();
        System.out.println("Rows Inserted " + count);
        stmt.close();
        conn.commit();
    }

    public static void queryTable(Connection connection) throws SQLException {
        System.out.println("Connection string is" + connection.toString());
        Statement statement = connection.createStatement();
//        connection.commit();
//        connection.rollback();
        ResultSet rs = statement.executeQuery("select * from student");
        //ScrollableResultSet
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
    }

    public static void queryTableWithScroll(Connection connection) throws SQLException {
        System.out.println("Connection string is" + connection.toString());
//        Statement statement = connection.createStatement();
        Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
//        connection.commit();
//        connection.rollback();
        ResultSet rs = statement.executeQuery("select * from student");
        //ScrollableResultSet
        if(rs != null )
        {
            rs.absolute(-2);
            System.out.println("The values are " + rs.getString(1) + "  " + rs.getString(2));
            rs.absolute(1);
            System.out.println("The values are " + rs.getString(1) + "  " + rs.getString(2));

            rs.next();
            System.out.println("The values are " + rs.getString(1) + "  " + rs.getString(2));
            rs.previous();
            System.out.println("The values are " + rs.getString(1) + "  " + rs.getString(2));
        }
        rs.close();
        statement.close();
//        connection.close();
    }

    public static void queryTablerWithSP(Connection connection, String name) throws SQLException {
        CallableStatement callableStatement = connection.prepareCall("call getStudent('" + name + "')");

        ResultSet rs = callableStatement.executeQuery();
        //ScrollableResultSet
        if(rs != null )
        {
            rs.next();
            System.out.println("The value are " + rs.getString("studentNumber") + " and " + rs.getString("studentName"));
        }
        rs.close();
        callableStatement.close();
//        connection.close();
    }



}
