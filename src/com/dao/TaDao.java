package com.dao;

import com.connect.MysqlConnect;
import com.model.TA;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 助教博士生增删改查
 */
public class TaDao {

    // 增加ta
        public void addTA(TA ta) throws SQLException {
            // 获得数据库的连接
            Connection conn = MysqlConnect.getConnnection();
            // sql语句
            String sql = "" +
                    "insert into TA" +
                    "(user_name, id_, gender, birthday, studentNo, school, class_, direction, adviserName,teacherNo,schoolName,department)" +
                    "values(" +
                    "?,?,?,?,?,?,?,?,?,?,?,?)";
            // 预编译sql语句
            PreparedStatement ptmt = conn.prepareStatement(sql);
            // 给sql语句传递参数
            ptmt.setString(1, ta.getUser_name());
            ptmt.setInt(2, ta.getId_());
            ptmt.setString(3, ta.getGender());
            ptmt.setDate(4, new Date(ta.getBirthday().getTime()));
            ptmt.setInt(5, ta.getStudentNo());
            ptmt.setString(6, ta.getSchool());
            ptmt.setString(7, ta.getClass_());
            ptmt.setString(8, ta.getDirection());
            ptmt.setString(9, ta.getAdviserName());
            ptmt.setInt(10, ta.getTeacherNo());
            ptmt.setString(11, ta.getSchoolName());
            ptmt.setString(12, ta.getDepartment());
            // 调用execute方法执行
            ptmt.execute();
        }
    // 更新ta
    public void updateTA(TA ta) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " update ta " +
                " set user_name = ?, id_ = ?, gender = ?, birthday = ?, school = ?, class_ = ?, direction = ?, adviserName = ?, teacherNo = ?, schoolName = ?, department = ? " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setString(1, ta.getUser_name());
        ptmt.setInt(2, ta.getId_());
        ptmt.setString(3, ta.getGender());
        ptmt.setDate(4, new Date(ta.getBirthday().getTime()));
        ptmt.setString(5, ta.getSchool());
        ptmt.setString(6, ta.getClass_());
        ptmt.setString(7, ta.getDirection());
        ptmt.setString(8, ta.getAdviserName());
        ptmt.setInt(9, ta.getTeacherNo());
        ptmt.setString(10, ta.getSchoolName());
        ptmt.setString(11, ta.getDepartment());
        ptmt.setInt(12, ta.getStudentNo());
        // 调用execute方法执行
        ptmt.execute();
    }
    // 删除ta
    public void delTA(Integer schoolNo) throws SQLException {
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " delete from ta " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setInt(1, schoolNo);
        // 调用execute方法执行
        ptmt.execute();
    }
    // 查询ta(查询全部结果）
    public List<TA> query() throws SQLException {
        // 数据库查询
        Connection conn = MysqlConnect.getConnnection();
        Statement stmt = conn.createStatement();
        // 执行sql语句
        ResultSet rs = stmt.executeQuery("select user_name, id_, gender, birthday, studentNo, school, class_, direction, adviserName, teacherNo, schoolName, department from ta");

        List<TA> ta = new ArrayList<TA>();
        TA t = null;

        // 将查到的结果添加到List中
        while (rs.next()) {
           t = new TA();
            t.setUser_name(rs.getString("user_name"));
            t.setId_(rs.getInt("id_"));
            t.setGender(rs.getString("gender"));
            t.setBirthday(rs.getDate("birthday"));
            t.setStudentNo(rs.getInt("studentNo"));
            t.setSchool(rs.getString("school"));
            t.setClass_(rs.getString("class_"));
            t.setDirection(rs.getString("direction"));
            t.setAdviserName(rs.getString("adviserName"));
            t.setTeacherNo(rs.getInt("teacherNo"));
            t.setSchoolName(rs.getString("schoolName"));
            t.setDepartment(rs.getString("department"));
            ta.add(t);
        }
        return ta;
    }

    // 优化查询ta(有参数）
    // 通过集合方式传进参数
    public List<TA> query(List<Map<String, Object>> params) throws SQLException {
        List<TA> result = new ArrayList<TA>();
        // 获取数据库连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ta where 1=1 ");

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

        List<TA> ta = new ArrayList<TA>();
       TA t = null;

        // 将查到的结果添加到List中
        while (rs.next()) {
            t = new TA();
            t.setUser_name(rs.getString("user_name"));
            t.setId_(rs.getInt("id_"));
            t.setGender(rs.getString("gender"));
            t.setBirthday(rs.getDate("birthday"));
            t.setStudentNo(rs.getInt("studentNo"));
            t.setSchool(rs.getString("school"));
            t.setClass_(rs.getString("class_"));
            t.setDirection(rs.getString("direction"));
            t.setAdviserName(rs.getString("adviserName"));
            t.setTeacherNo(rs.getInt("teacherNo"));
            t.setSchoolName(rs.getString("schoolName"));
            t.setDepartment(rs.getString("department"));
            ta.add(t);
        }
        return ta;
    }

    // 查询单个ta
    public TA get(Integer studentNo) throws SQLException {
       TA t = null;
        // 获得数据库的连接
        Connection conn = MysqlConnect.getConnnection();
        // sql语句
        String sql = "" +
                " select * from ta " +
                " where studentNo = ? ";
        // 预编译sql语句
        PreparedStatement ptmt = conn.prepareStatement(sql);
        // 给sql语句传递参数
        ptmt.setInt(1, studentNo);
        // 调用executeQuery方法查询
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
            // 查询
            t = new TA();
            t.setUser_name(rs.getString("user_name"));
            t.setId_(rs.getInt("id_"));
            t.setGender(rs.getString("gender"));
            t.setBirthday(rs.getDate("birthday"));
            t.setStudentNo(rs.getInt("studentNo"));
            t.setSchool(rs.getString("school"));
            t.setClass_(rs.getString("class_"));
            t.setDirection(rs.getString("direction"));
            t.setAdviserName(rs.getString("adviserName"));
            t.setTeacherNo(rs.getInt("teacherNo"));
            t.setSchoolName(rs.getString("schoolName"));
            t.setDepartment(rs.getString("department"));
        }
        return t;
    }


//    // 创建ta表
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
//                    + "ta"
//                    + " (id integer primary key auto_increment, user_name varchar(10) not null, id_ varchar (18) not null, gender varchar(2) not null, birthday DATE not null, studentNo integer not null, school varchar(20) not null, class_ varchar(20) not null, direction varchar(20) not null, adviserName varchar(20) not null, teacherNo varchar(20) not null, schoolName varchar(20) not null, department varchar(20) not null )";
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
