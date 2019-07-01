package com.action;

import com.dao.UnderGraduateDao;
import com.model.UnderGraduate;

import java.util.List;
import java.util.Map;

/**
 * 本科生控制类
 */

public class UnderGraduateAction {

    // 添加
    public void add(UnderGraduate underGraduate) throws Exception {
        UnderGraduateDao dao = new UnderGraduateDao();
        // 调用添加方法
        dao.addunderGraduate(underGraduate);
    }
    // 更新（修改）
    public void edit(UnderGraduate underGraduate) throws Exception {
        UnderGraduateDao dao = new UnderGraduateDao();
        // 调用更新方法
        dao.updateunderGraduate(underGraduate);
    }

    // 删除
    public void del(Integer studentNo) throws Exception {
        UnderGraduateDao dao = new UnderGraduateDao();
        // 调用删除方法
        dao.delunderGraduate(studentNo);
    }
    // 查询（全部查询）
    public List<UnderGraduate> query() throws Exception {
        UnderGraduateDao dao = new UnderGraduateDao();
        // 调用全部查询方法
        return dao.query();
    }

    // 查询（参数查询）
    public List<UnderGraduate> query(List<Map<String, Object>> params) throws Exception {
        UnderGraduateDao dao = new UnderGraduateDao();
        // 调用参数查询方法
        return dao.query(params);
    }

    // 查询 （单个查询）
    public UnderGraduate get(Integer studentNo) throws Exception {
        UnderGraduateDao dao = new UnderGraduateDao();
        // 调用单个查询方法
        return dao.get(studentNo);

    }
}
