package com.test;

import com.action.TeacherAction;
import com.model.Teacher;

import java.util.*;

public class TestTeacherAction {
    public static void main(String[] args) throws Exception {
        TeacherAction action = new TeacherAction();

        // 查询
//        List<Teacher> result = action.query();
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i).getUser_name() +
//                    ":" + result.get(i).getId_() + ":" + result.get(i).getTeacherNo());
//        }

        // 添加
        Teacher t1 = new Teacher();
        t1.setUser_name("小王1");
        t1.setId_(123456789);
        t1.setGender("女");
        t1.setBirthday(new Date());
        t1.setTeacherNo(3);
        t1.setSchoolName("太原理工大学");
        t1.setDepartment("大数据学院");
        // 添加
//        action.add(t1);

        // 更新
//        action.edit(t1);

        // 删除
//        action.del(3);

        // 查询二（参数查询）
//        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
//
//        Map<String, Object> param = new HashMap<String, Object>();
//        // 参数一
//        param.put("name", "user_name");
//        param.put("rela", "=");
//        param.put("value", "'李毅'");
//        // 将参数添加到集合
//        params.add(param);
//        // 参数二
//        param = new HashMap<String, Object>();
//        param.put("name", "id_");
//        param.put("rela", "like");
//        param.put("value", "'%123456%'");
//        // 将参数添加到集合
//        params.add(param);
//        List<Teacher> result = action.query(params);
//        //打印输出
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i).toString());
//        }

        // 查询三（单个）
//        Teacher t2 = action.get(1);
        //打印教师信息
//        System.out.println(t2.toString());
    }
}
