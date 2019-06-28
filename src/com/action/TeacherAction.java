package com.action;

import com.model.Teacher;
import com.dao.TeacherDao;

import java.util.*;

/**
 * 教师控制类
 */

public class TeacherAction {

    // 添加
    public void add(Teacher teacher) throws Exception {
        TeacherDao dao = new TeacherDao();
        // 调用添加方法
        dao.addTeacher(teacher);

    }

    // 更新（修改）
    public void edit(Teacher teacher) throws Exception {
        TeacherDao dao = new TeacherDao();
        // 调用更新方法
        dao.updateTeacher(teacher);
    }

    // 删除
    public void del(Integer teacherNo) throws Exception {
        TeacherDao dao = new TeacherDao();
        // 调用删除方法
        dao.delTeacher(teacherNo);
    }

    // 查询（全部查询）
    public List<Teacher> query() throws Exception {
        TeacherDao dao = new TeacherDao();
        // 调用全部查询方法
        return dao.query();
    }

    // 查询（参数查询）
    public List<Teacher> query(List<Map<String, Object>> params) throws Exception {
        TeacherDao dao = new TeacherDao();
        // 调用参数查询方法
        return dao.query(params);
    }

    // 查询 （单个查询）
    public Teacher get(Integer teacherNo) throws Exception {
        TeacherDao dao = new TeacherDao();
        // 调用单个查询方法
        return dao.get(teacherNo);

    }
}
