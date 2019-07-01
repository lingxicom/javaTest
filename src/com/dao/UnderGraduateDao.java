package com.dao;

import com.connect.MysqlConnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UnderGraduateDao {






    // 创建underGraduate表
//    public static void main(String[] args) {
//        Connection conn = MysqlConnect.getConnnection();
//        if (conn != null) {
//            System.out.println("连接上了");
//            createTable(conn);
//        } else {
//            System.out.println("连接失败");
//        }
//    }
//
//    public static boolean createTable(Connection conn) {
//        // 开始执行sql语句
//        String sql = "create table "
//                + "undergraduate"
//                + " (id integer primary key auto_increment, user_name varchar(10) not null, id_ varchar (18) not null, gender varchar(2) not null, birthday DATE not null, studentNo integer not null, school varchar(20) not null, class_ varchar(20) not null, major varchar(20) not null )";
//        try {
//            Statement st = conn.createStatement();
//            int result = st.executeUpdate(sql);
//            System.out.println(result);
//            if (result != -1)
//                return true;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
