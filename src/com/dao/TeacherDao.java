package com.dao;

import com.connect.MysqlConnect;
import com.model.Teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 老师增删改查
 */

public class TeacherDao {

    // 增加teacher
    public void addTeacher(Teacher t) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                "insert into teacher" +
                "(user_name, id_, gender, birthday, teacherNo, schoolName, department)" +
                "values(" +
                "?,?,?,?,?,?,?)";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setString(1, t.getUser_name());
        ptmt.setInt(2, t.getId_());
        ptmt.setString(3, t.getGender());
        ptmt.setDate(4, new Date(t.getBirthday().getTime()));
        ptmt.setInt(5, t.getTeacherNo());
        ptmt.setString(6, t.getSchoolName());
        ptmt.setString(7, t.getDepartment());
        // 调用execute方法执行
        ptmt.execute();
    }

    // 更新teacher
    public void updateTeacher(Teacher t) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " update  teacher " +
                " set user_name = ?, id_ = ?, gender = ?, birthday = ?, schoolName = ?, department = ? " +
                " where teacherNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setString(1, t.getUser_name());
        ptmt.setInt(2, t.getId_());
        ptmt.setString(3, t.getGender());
        ptmt.setDate(4, new Date(t.getBirthday().getTime()));
        ptmt.setString(5, t.getSchoolName());
        ptmt.setString(6, t.getDepartment());
        ptmt.setInt(7, t.getTeacherNo());
        // 调用execute方法执行
        ptmt.execute();
    }

    // 删除teacher
    public void delTeacher(Integer teacherNo) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " delete from teacher " +
                " where teacherNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setInt(1, teacherNo);
        // 调用execute方法执行
        ptmt.execute();
    }

    // 查询teacher(查询全部结果）
    public List<Teacher> query() throws SQLException {
        // 数据库查询
        Connection conn = MysqlConnect.getConnnection();
        Statement stmt = conn.createStatement();
        // 执行sql语句
        ResultSet rs = stmt.executeQuery("select user_name, id_, gender, birthday, teacherNo, schoolName, department from teacher");

        List<Teacher> te = new ArrayList<Teacher>();
        Teacher t = null;

        // 将查到的结果添加到List中
        while (rs.next()) {
            t = new Teacher();
            t.setUser_name(rs.getString("user_name"));
            t.setId_(rs.getInt("id_"));
            t.setGender(rs.getString("gender"));
            t.setBirthday(rs.getDate("birthday"));
            t.setTeacherNo(rs.getInt("teacherNo"));
            t.setSchoolName(rs.getString("schoolName"));
            t.setDepartment(rs.getString("department"));
            te.add(t);
        }
        return te;
    }

    // 优化查询教师(有参数）
    // 通过集合方式传进参数
    public List<Teacher> query(List<Map<String, Object>> params) throws SQLException {
        List<Teacher> result = new ArrayList<Teacher>();
        // 获取数据库连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        StringBuilder sb = new StringBuilder();
        sb.append("select * from teacher where 1=1 ");

        // 判断集合是否为空
        if (params != null && params.size() > 0) {
            // 遍历集合
            for (int i = 0; i < params.size(); i++) {
                Map<String, Object> map = params.get(i);
                // 拼接sql语句
                sb.append(" and " + " " + map.get("name") + " " + map.get("rela") + " " + map.get("value"));
            }
        }
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sb.toString());

        // 执行sql语句
        ResultSet rs = ptmt.executeQuery();

        List<Teacher> te = new ArrayList<Teacher>();
        Teacher t = null;

        // 将查到的结果添加到List中
        while (rs.next()) {
            t = new Teacher();
            t.setUser_name(rs.getString("user_name"));
            t.setId_(rs.getInt("id_"));
            t.setGender(rs.getString("gender"));
            t.setBirthday(rs.getDate("birthday"));
            t.setDepartment(rs.getString("department"));
            t.setSchoolName(rs.getString("schoolName"));
            t.setTeacherNo(rs.getInt("teacherNo"));

            te.add(t);
        }
        return te;
    }

    // 查询单个老师
    public Teacher get(Integer teacherNo) throws SQLException {
        Teacher t = null;
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " select * from teacher " +
                " where teacherNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setInt(1, teacherNo);
        // 调用executeQuery方法查询
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
            // 查询
            t = new Teacher();
            t.setUser_name(rs.getString("user_name"));
            t.setId_(rs.getInt("id_"));
            t.setGender(rs.getString("gender"));
            t.setBirthday(rs.getDate("birthday"));
            t.setDepartment(rs.getString("department"));
            t.setSchoolName(rs.getString("schoolName"));
            t.setTeacherNo(rs.getInt("teacherNo"));
        }
        return t;
    }


// 创建teacher表

//public static void main(String[] args) {
//    Connection conn = MysqlConnect.getConnnection();
//    if (conn != null) {
//        System.out.println("连接上了");
//        createTable(conn);
//    } else {
//        System.out.println("连接失败");
//    }
//}
//
//    public static boolean createTable(Connection conn) {
//        // 开始执行sql语句
//        String sql = "create table "
//                + "teacher"
//                + " (id integer primary key auto_increment, user_name varchar(10) not null, id_ varchar (18) not null, gender varchar(2) not null, birthday DATE not null, teacherNo integer not null, schoolName varchar(20) not null, department varchar(20) not null )";
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


