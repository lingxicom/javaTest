package com.action;

import com.dao.GraduateDao;
import com.model.Graduate;

import java.util.List;
import java.util.Map;

/**
 * 研究生控制类
 */

public class GraduateAction {

    // 添加
    public void add(Graduate graduate) throws Exception {
        GraduateDao dao = new GraduateDao();
        // 调用添加方法
        dao.addgraduate(graduate);
    }

    // 更新（修改）
    public void edit(Graduate graduate) throws Exception {
        GraduateDao dao = new GraduateDao();
        // 调用更新方法
        dao.updateGraduate(graduate);
    }

    // 删除
    public void del(Integer studentNo) throws Exception {
        GraduateDao dao = new GraduateDao();
        // 调用删除方法
        dao.delGraduate(studentNo);
    }

    // 查询（全部查询）
    public List<Graduate> query() throws Exception {
        GraduateDao dao = new GraduateDao();
        // 调用全部查询方法
        return dao.query();
    }

    // 查询（参数查询）
    public List<Graduate> query(List<Map<String, Object>> params) throws Exception {
        GraduateDao dao = new GraduateDao();
        // 调用参数查询方法
        return dao.query(params);
    }

    // 查询 （单个查询）
    public Graduate get(Integer studentNo) throws Exception {
        GraduateDao dao = new GraduateDao();
        // 调用单个查询方法
        return dao.get(studentNo);
    }
}
