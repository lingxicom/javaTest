package com.connect;

/**
 * 连接数据库
 */

import java.sql.*;

public class MysqlConnect {
    public static final String URL = "jdbc:mysql://localhost:3306/javatest";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    private static Connection conn = null;

    static {
        try {
            // 加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            // 获取数据库连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("驱动加载失败");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("驱动加载失败");
            e.printStackTrace();
        }
    }

    public static Connection getConnnection() {
        return conn;
    }
}
