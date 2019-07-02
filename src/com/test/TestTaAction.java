package com.test;

import com.action.TaAction;
import com.model.TA;

import java.util.*;

public class TestTaAction {
    public static void main(String[] args) throws Exception {
       TaAction taAction = new TaAction();

//        // 添加
//        TA ta1 = new TA();
//        ta1.setUser_name("小王1");
//        ta1.setId_(123456789);
//        ta1.setGender("女");
//        ta1.setBirthday(new Date());
//        ta1.setStudentNo(3);
//        ta1.setSchool("太原理工大学");
//        ta1.setClass_("软件1840");
//        ta1.setDirection("软件工程");
//        ta1.setAdviserName("李老师");
//        ta1.setTeacherNo(321654);
//        ta1.setSchoolName("北大");
//        ta1.setDepartment("辅导员");
//        // 添加
//        taAction.add(ta1);
        // 查询
//        List<TA> result =taAction.query();
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i).getUser_name() +
//                    ":" + result.get(i).getId_() + ":" + result.get(i).getStudentNo());
//        }
        // 更新
//        taAction.edit(ta1);

        // 删除
       // taAction.del(3);

        // 查询二（参数查询）
        List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();

        Map<String, Object> param = new HashMap<String, Object>();
        // 参数一
        param.put("name", "user_name");
        param.put("rela", "=");
        param.put("value", "'小王1'");
        // 将参数添加到集合
        params.add(param);
        // 参数二
        param = new HashMap<String, Object>();
        param.put("name", "id_");
        param.put("rela", "like");
        param.put("value", "'%123456789%'");
        // 将参数添加到集合
        params.add(param);
        List<TA> result = taAction.query(params);
        //打印输出
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }

        // 查询三（单个）
//    TA t2 = taAction.get(3);
//    // 打印教师信息
//        System.out.println(t2.toString());
//}

    }



}
