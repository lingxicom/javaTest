package com.action;

import com.dao.TaDao;
import com.model.TA;

import java.util.List;
import java.util.Map;

public class TaAction {
    // 添加
    public void add(TA ta) throws Exception {
        TaDao dao = new TaDao();
        // 调用添加方法
        dao.addTA(ta);
    }
    // 更新（修改）
    public void edit(TA ta) throws Exception {
        TaDao dao = new TaDao();
        // 调用更新方法
        dao.updateTA(ta);
    }

    // 删除
    public void del(Integer studentNo) throws Exception {
        TaDao dao = new TaDao();
        // 调用删除方法
        dao.delTA(studentNo);
    }

    // 查询（全部查询）
    public List<TA> query() throws Exception {
        TaDao dao = new TaDao();
        // 调用全部查询方法
        return dao.query();
    }

    // 查询（参数查询）
    public List<TA> query(List<Map<String, Object>> params) throws Exception {
        TaDao dao = new TaDao();
        // 调用参数查询方法
        return dao.query(params);
    }

    // 查询 （单个查询）
    public TA get(Integer studentNo) throws Exception {
        TaDao dao = new TaDao();
        // 调用单个查询方法
        return dao.get(studentNo);
    }
}
