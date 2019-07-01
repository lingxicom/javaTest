package com.test;

import com.action.UnderGraduateAction;
import com.model.UnderGraduate;
import java.util.*;

public class TestUndergraduateAction {
    public static void main(String[] args) throws Exception {
        UnderGraduateAction action = new UnderGraduateAction();
        // 添加
//        UnderGraduate ug1 = new UnderGraduate();
//        ug1.setUser_name("小王");
//        ug1.setId_(123456789);
//        ug1.setGender("男");
//        ug1.setBirthday(new Date());
//        ug1.setStudentNo(20180000);
//        ug1.setSchool("北京大学");
//        ug1.setClass_("软件1840");
//        ug1.setMajor("ruanjian");
        // 添加
//        action.add(ug1);
        // 更新
       // action.edit(ug1);

        // 删除
//        action.del(20180000);

        // 查询二（参数查询）
//        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
//
//        Map<String, Object> param = new HashMap<String, Object>();
//        //参数一
//        param.put("name", "user_name");
//        param.put("rela", "=");
//        param.put("value", "'李毅'");
//        // 将参数添加到集合
//        params.add(param);
////        // 参数二
//        param = new HashMap<String, Object>();
//        param.put("name", "id_");
//        param.put("rela", "like");
//        param.put("value", "'%123456%'");
//        // 将参数添加到集合
//        params.add(param);
//        UnderGraduateAction ugtion;
//        List<UnderGraduate> result = action.query(params);
//        //打印输出
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i).toString());
//        }

        // 查询三（单个）
        UnderGraduate t2 = action.get(20180000);
        //打印教师信息
       System.out.println(t2.toString());

    }
}