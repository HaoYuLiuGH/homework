
package com.company;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;





public class datautils {

    public static final String Driver = "com.mysql.jdbc.Driver";

    public static final String url = "jdbc:mysql://localhost:3306/nyb?useSSL=true";

    public static final String user = "root";

    public static final String password = "123456";



    static {

        try {

            Class.forName(Driver);

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

    }

    public static Connection getConnection() throws SQLException{

        Connection conn = null;

        conn = DriverManager.getConnection(url,user,password);

        return conn;

    }

}
