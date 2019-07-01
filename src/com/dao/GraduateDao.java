package com.dao;

import com.connect.MysqlConnect;
import com.model.Graduate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 研究生增删改查
 */

public class GraduateDao {

    // 增加graduate
    public void addgraduate(Graduate g) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                "insert into graduate" +
                "(user_name, id_, gender, birthday, studentNo, school, class_, direction, adviserName)" +
                "values(" +
                "?,?,?,?,?,?,?,?,?)";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setString(1, g.getUser_name());
        ptmt.setInt(2, g.getId_());
        ptmt.setString(3, g.getGender());
        ptmt.setDate(4, new Date(g.getBirthday().getTime()));
        ptmt.setInt(5, g.getStudentNo());
        ptmt.setString(6, g.getSchool());
        ptmt.setString(7, g.getClass_());
        ptmt.setString(8, g.getDirection());
        ptmt.setString(9, g.getAdviserName());
        // 调用execute方法执行
        ptmt.execute();
    }

    // 更新graduate
    public void updateGraduate(Graduate g) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " update  graduate " +
                " set user_name = ?, id_ = ?, gender = ?, birthday = ?, school = ?, class_ = ?, direction = ?, adviserName = ? " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setString(1, g.getUser_name());
        ptmt.setInt(2, g.getId_());
        ptmt.setString(3, g.getGender());
        ptmt.setDate(4, new Date(g.getBirthday().getTime()));
        ptmt.setString(5, g.getSchool());
        ptmt.setString(6, g.getClass_());
        ptmt.setString(7, g.getDirection());
        ptmt.setString(8, g.getAdviserName());
        ptmt.setInt(9, g.getStudentNo());
        // 调用execute方法执行
        ptmt.execute();
    }

    // 删除graduate
    public void delGraduate(Integer schoolNo) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " delete from graduate " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setInt(1, schoolNo);
        // 调用execute方法执行
        ptmt.execute();
    }

    // 查询graduate(查询全部结果）
    public List<Graduate> query() throws SQLException {
        // 数据库查询
        Connection conn = MysqlConnect.getConnnection();
        Statement stmt = conn.createStatement();
        // 执行sql语句
        ResultSet rs = stmt.executeQuery("select user_name, id_, gender, birthday, studentNo, school, class_, direction, adviserName from graduate");

        List<Graduate> ge = new ArrayList<Graduate>();
        Graduate g = null;

        // 将查到的结果添加到List中
        while (rs.next()) {
            g = new Graduate();
            g.setUser_name(rs.getString("user_name"));
            g.setId_(rs.getInt("id_"));
            g.setGender(rs.getString("gender"));
            g.setBirthday(rs.getDate("birthday"));
            g.setStudentNo(rs.getInt("studentNo"));
            g.setSchool(rs.getString("school"));
            g.setClass_(rs.getString("class_"));
            g.setDirection(rs.getString("direction"));
            g.setAdviserName(rs.getString("adviserName"));
            ge.add(g);
        }
        return ge;
    }

    // 优化查询研究生(有参数）
    // 通过集合方式传进参数
    public List<Graduate> query(List<Map<String, Object>> params) throws SQLException {
        List<Graduate> result = new ArrayList<Graduate>();
        // 获取数据库连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        StringBuilder sb = new StringBuilder();
        sb.append("select * from graduate where 1=1 ");

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

        List<Graduate> ge = new ArrayList<Graduate>();
        Graduate g = null;

        // 将查到的结果添加到List中
        while (rs.next()) {
            g = new Graduate();
            g.setUser_name(rs.getString("user_name"));
            g.setId_(rs.getInt("id_"));
            g.setGender(rs.getString("gender"));
            g.setBirthday(rs.getDate("birthday"));
            g.setStudentNo(rs.getInt("studentNo"));
            g.setSchool(rs.getString("school"));
            g.setClass_(rs.getString("class_"));
            g.setDirection(rs.getString("direction"));
            g.setAdviserName(rs.getString("adviserName"));
            ge.add(g);
        }
        return ge;
    }

    // 查询单个研究生
    public Graduate get(Integer studentNo) throws SQLException {
        Graduate g = null;
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " select * from graduate " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setInt(1, studentNo);
        // 调用executeQuery方法查询
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
            // 查询
            g = new Graduate();
            g.setUser_name(rs.getString("user_name"));
            g.setId_(rs.getInt("id_"));
            g.setGender(rs.getString("gender"));
            g.setBirthday(rs.getDate("birthday"));
            g.setStudentNo(rs.getInt("studentNo"));
            g.setSchool(rs.getString("school"));
            g.setClass_(rs.getString("class_"));
            g.setDirection(rs.getString("direction"));
            g.setAdviserName(rs.getString("adviserName"));
        }
        return g;
    }


    // 创建graduate表
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
//                    + "graduate"
//                    + " (id integer primary key auto_increment, user_name varchar(10) not null, id_ varchar (18) not null, gender varchar(2) not null, birthday DATE not null, studentNo integer not null, school varchar(20) not null, class_ varchar(20) not null, direction varchar(20) not null, adviserName varchar(20) not null)";
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
