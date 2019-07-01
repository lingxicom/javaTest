package com.dao;

import com.connect.MysqlConnect;
import com.model.UnderGraduate;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnderGraduateDao {

    // 增加underGraduate
    public void addunderGraduate(UnderGraduate ug) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                "insert into undergraduate" +
                "(user_name, id_, gender, birthday, studentNo, school, class_, major)" +
                "values(" +
                "?,?,?,?,?,?,?,?)";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setString(1, ug.getUser_name());
        ptmt.setInt(2, ug.getId_());
        ptmt.setString(3, ug.getGender());
        ptmt.setDate(4, new Date(ug.getBirthday().getTime()));
        ptmt.setInt(5, ug.getStudentNo());
        ptmt.setString(6, ug.getSchool());
        ptmt.setString(7, ug.getClass_());
        ptmt.setString(8, ug.getMajor());
        // 调用execute方法执行
        ptmt.execute();
    }

     //更新underGraduate
    public void updateunderGraduate(UnderGraduate ug) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " update  undergraduate " +
                " set user_name = ?, id_ = ?, gender = ?, birthday = ?,school = ?, class_ = ?, major = ? " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setString(1, ug.getUser_name());
        ptmt.setInt(2, ug.getId_());
        ptmt.setString(3, ug.getGender());
        ptmt.setDate(4, new Date(ug.getBirthday().getTime()));
        ptmt.setString(5, ug.getSchool());
        ptmt.setString(6, ug.getClass_());
        ptmt.setString(7, ug.getMajor());
        ptmt.setInt(8, ug.getStudentNo());
        // 调用execute方法执行
        ptmt.execute();
    }

    // 删除
    public void delunderGraduate(Integer studentNo) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " delete from undergraduate " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setInt(1, studentNo);
        // 调用execute方法执行
        ptmt.execute();
    }
    // 查询UnderGraduate(查询全部结果）
    public List<UnderGraduate> query() throws SQLException {
        // 数据库查询
        Connection conn = MysqlConnect.getConnnection();
        Statement stmt = conn.createStatement();
        // 执行sql语句
        ResultSet rs = stmt.executeQuery("select user_name, id_, gender, birthday, studentNo, school, class_, major from undergraduate");

        List<UnderGraduate> te = new ArrayList<UnderGraduate>();
        UnderGraduate ug = null;

        // 将查到的结果添加到List中
        while (rs.next()) {
            ug = new UnderGraduate();
            ug.setUser_name(rs.getString("user_name"));
            ug.setId_(rs.getInt("id_"));
            ug.setGender(rs.getString("gender"));
            ug.setBirthday(rs.getDate("birthday"));
            ug.setStudentNo(rs.getInt("studentNo"));
            ug.setSchool(rs.getString("school"));
            ug.setClass_(rs.getString("class_"));
            ug.setMajor(rs.getString("major"));
            te.add(ug);
        }
        return te;
    }

    // 优化查询本科生(有参数）
    // 通过集合方式传进参数
    public List<UnderGraduate> query(List<Map<String, Object>> params) throws SQLException {
        List<UnderGraduate> result = new ArrayList<UnderGraduate>();
        // 获取数据库连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        StringBuilder sb = new StringBuilder();
        sb.append("select * from undergraduate where 1=1 ");

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

        List<UnderGraduate> te = new ArrayList<UnderGraduate>();
        UnderGraduate ug = null;

        // 将查到的结果添加到List中
        while (rs.next()) {
            ug = new UnderGraduate();
            ug.setUser_name(rs.getString("user_name"));
            ug.setId_(rs.getInt("id_"));
            ug.setGender(rs.getString("gender"));
            ug.setBirthday(rs.getDate("birthday"));
            ug.setStudentNo(rs.getInt("studentNo"));
            ug.setSchool(rs.getString("school"));
            ug.setClass_(rs.getString("class_"));
            ug.setMajor(rs.getString("major"));

            te.add(ug);
        }
        return te;
    }

    // 查询单个本科生
    public UnderGraduate get(Integer studentNo) throws SQLException {
        UnderGraduate ug = null;
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " select * from undergraduate " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setInt(1, studentNo);
        // 调用executeQuery方法查询
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
            // 查询
            ug = new UnderGraduate();
            ug.setUser_name(rs.getString("user_name"));
            ug.setId_(rs.getInt("id_"));
            ug.setGender(rs.getString("gender"));
            ug.setBirthday(rs.getDate("birthday"));
            ug.setStudentNo(rs.getInt("studentNo"));
            ug.setSchool(rs.getString("school"));
            ug.setClass_(rs.getString("class_"));
            ug.setMajor(rs.getString("major"));
        }
        return ug;
    }

    // 创建undergraduate表
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
//        public static boolean createTable(Connection conn) {
//            // 开始执行sql语句
//            String sql = "create table "
//                    + "undergraduate"
//                    + " (id integer primary key auto_increment, user_name varchar(10) not null, id_ varchar (18) not null, gender varchar(2) not null, birthday DATE not null, studentNo integer not null, school varchar(20) not null, class_ varchar(20) not null, major varchar(20) not null )";
//            try {
//                Statement st = conn.createStatement();
//                int result = st.executeUpdate(sql);
//                System.out.println(result);
//                if (result != -1)
//                    return true;
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return false;
//        }
}
