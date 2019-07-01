package com.test;

import com.action.GraduateAction;
import com.model.Graduate;

import java.util.*;

/**
 * 研究生测试类
 */

public class TestGraduateAction {

    public static void main(String[] args) throws Exception {
        GraduateAction action = new GraduateAction();

        // 添加
        Graduate g1 = new Graduate();
        g1.setUser_name("小王1");
        g1.setId_(123456789);
        g1.setGender("女");
        g1.setBirthday(new Date());
        g1.setStudentNo(3);
        g1.setSchool("太原理工大学");
        g1.setClass_("软件1840");
        g1.setDirection("软件工程");
        g1.setAdviserName("李老师");
        // 添加
//        action.add(g1);

        // 查询
//        List<Graduate> result = action.query();
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i).getUser_name() +
//                    ":" + result.get(i).getId_() + ":" + result.get(i).getStudentNo());
//        }

        // 更新
//        action.edit(g1);

        // 删除
//        action.del(3);

        // 查询二（参数查询）
//        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
//
//        Map<String, Object> param = new HashMap<String, Object>();
//        // 参数一
//        param.put("name", "user_name");
//        param.put("rela", "=");
//        param.put("value", "'小王1'");
//        // 将参数添加到集合
//        params.add(param);
//        // 参数二
//        param = new HashMap<String, Object>();
//        param.put("name", "id_");
//        param.put("rela", "like");
//        param.put("value", "'%123456%'");
//        // 将参数添加到集合
//        params.add(param);
//        List<Graduate> result = action.query(params);
//        //打印输出
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i).toString());
//        }

        // 查询三（单个）
        Graduate g2 = action.get(3);
        // 打印教师信息
        System.out.println(g2.toString());
    }
}
