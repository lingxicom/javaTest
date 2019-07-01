package com.view;

import com.action.GraduateAction;
import com.model.Graduate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 研究生视图类
 * 用户交互
 */

public class GraduateView {

    // 提示语
    private static final String CONTEXT = "研究生服务系统 \n" +
            "[MAIN/M]:主菜单\n" +
            "[QUERY/Q]:查看全部研究生信息\n" +
            "[GET/G]:查看某位研究生的详细信息\n" +
            "[ADD/A]:添加研究生信息\n" +
            "[UPDATE/U]:修改研究生信息\n" +
            "[DELETE/D]:删除研究生信息\n" +
            "[SEARCH/S]:查询研究生信息\n(根据姓名，学号来查询）\n" +
            "[EXIT/E]:退出研究生服务系统\n" +
            "[BREAK/B]:退出当前功能，返回主菜单";

    // 操作标记
    private static final String OPERATION_MAIN = "MAIN";
    private static final String OPERATION_QUERY = "QUERY";
    private static final String OPERATION_GET = "GET";
    private static final String OPERATION_ADD = "ADD";
    private static final String OPERATION_UPDATE = "UPDATE";
    private static final String OPERATION_DELETE = "DELETE";
    private static final String OPERATION_SEARCH = "SEARCH";
    private static final String OPERATION_EXIT = "EXIT";
    private static final String OPERATION_BREAK = "BREAK";

    public static void main(String[] args) {
        // 输出提示信息
        System.out.println(CONTEXT);

        Scanner scan = new Scanner(System.in);
        // 记忆变量
        String prenious = null;
        // 步骤变量
        Integer step = 1;
        // 全局变量
        Graduate graduate = new Graduate();
        GraduateAction gactin = new GraduateAction();

        // 保持程序一直运行,循环接受控制台参数
        while (scan.hasNext()) {
            String in = scan.next().toString();

            // 退出(输入EXIT或exit或E或e)
            if (OPERATION_EXIT.equals(in.toUpperCase()) ||
                    OPERATION_EXIT.substring(0, 1).equals(in.toUpperCase())) {
                System.out.println("您已成功退出研究生服务系统！");
                break;
            }
            // 添加研究生信息
            else if (OPERATION_ADD.equals(in.toUpperCase()) ||
                    OPERATION_ADD.substring(0, 1).equals(in.toUpperCase())
                    || OPERATION_ADD.equals(prenious)) {
                prenious = OPERATION_ADD;
                if (1 == step) {
                    System.out.println("请输入研究生的[姓名]");
                } else if (2 == step) {
                    graduate.setUser_name(in);
                    System.out.println("请输入研究生的[身份证号]");
                } else if (3 == step) {
                    graduate.setId_(Integer.valueOf(in));
                    System.out.println("请输入研究生的[性别]");
                } else if (4 == step) {
                    graduate.setGender(in);
                    System.out.println("请输入研究生的[生日], 格式如：yyyy-MM-dd");
                } else if (5 == step) {
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                    Date birthday = null;
                    try {
                        birthday = sf.parse(in);
                        graduate.setBirthday(birthday);
                        System.out.println("请输入研究生的[学号]");
                    } catch (ParseException e) {
                        e.printStackTrace();
                        System.out.println("您输入的格式有误，请重新输入");
                        step = 4;
                    }
                } else if (6 == step) {
                    graduate.setStudentNo(Integer.valueOf(in));
                    System.out.println("请输入研究生的[学校]");
                } else if (7 == step) {
                    graduate.setSchool(in);
                    System.out.println("请输入研究生的[班级]");
                } else if (8 == step) {
                    graduate.setClass_(in);
                    System.out.println("请输入研究生的[专业]");
                } else if (9 == step) {
                    graduate.setDirection(in);
                    System.out.println("请输入研究生的[导师姓名]");
                } else if (10 == step) {
                    graduate.setAdviserName(in);
                    try {
                        gactin.add(graduate);
                        System.out.println("添加研究生信息成功！！");
                        prenious = null;
                        step = 1;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("添加研究生信息失败！！");
                        prenious = null;
                        step = 1;
                    }
                }
                if (OPERATION_ADD.equals(prenious)) {
                    step++;
                }
            }
            // 修改研究生信息
            else if (OPERATION_UPDATE.equals(in.toUpperCase()) ||
                    OPERATION_UPDATE.substring(0, 1).equals(in.toUpperCase())
                    || OPERATION_UPDATE.equals(prenious)) {
                prenious = OPERATION_UPDATE;
                if (1 == step) {
                    System.out.println("请输入要修改研究生的[学号]");
                } else if (2 == step) {
                    try {
                        graduate = gactin.get(Integer.valueOf(in));
                        if (graduate == null) {
                            System.out.println("学号错误，请重新输入");
                            continue;
                        }
                        System.out.println("请输入要研究生的[姓名]");
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("学号错误，请重新输入");
                        continue;
                    }
                } else if (3 == step) {
                    graduate.setUser_name(in);
                    System.out.println("请输入研究生的[身份证号]");
                } else if (4 == step) {
                    graduate.setId_(Integer.valueOf(in));
                    System.out.println("请输入研究生的[性别]");
                } else if (5 == step) {
                    graduate.setGender(in);
                    System.out.println("请输入研究生的[生日], 格式如：yyyy-MM-dd");
                } else if (6 == step) {
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                    Date birthday = null;
                    try {
                        birthday = sf.parse(in);
                        graduate.setBirthday(birthday);
                        System.out.println("请输入研究生的[学校]");
                    } catch (ParseException e) {
                        e.printStackTrace();
                        System.out.println("您输入的格式有误，请重新输入");
                        step = 5;
                    }
                } else if (6 == step) {
                    graduate.setSchool(in);
                    System.out.println("请输入研究生的[班级]");
                } else if (7 == step) {
                    graduate.setClass_(in);
                    System.out.println("请输入研究生的[专业]");
                } else if (8 == step) {
                    graduate.setDirection(in);
                    System.out.println("请输入研究生的[导师姓名]");
                } else if (9 == step) {
                    graduate.setAdviserName(in);
                    try {
                        gactin.edit(graduate);
                        System.out.println("修改研究生信息成功！！");
                        prenious = null;
                        step = 1;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("修改研究生信息失败！！");
                        prenious = null;
                        step = 1;
                    }
                }
                if (OPERATION_UPDATE.equals(prenious)) {
                    step++;
                }
            }
            // 删除研究生信息
            else if (OPERATION_DELETE.equals(in.toUpperCase()) ||
                    OPERATION_DELETE.substring(0, 1).equals(in.toUpperCase())) {
                System.out.println("请输入要删除的研究生的[学号]");
                try {
                    Integer no = new Integer(scan.nextInt());
                    gactin.del(no);
                    System.out.println("研究生信息删除成功~");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("研究生信息删除失败~");
                }
            }
            // 查询研究生信息
            else if (OPERATION_QUERY.equals(in.toUpperCase()) ||
                    OPERATION_QUERY.substring(0, 1).equals(in.toUpperCase())) {
                try {
                    List<Graduate> list = gactin.query();
                    // 将查询结果输出
                    for (Graduate ge : list) {
                        System.out.println("姓名：" + ge.getUser_name() + "," + "研究生号：" + ge.getStudentNo());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            // 查询研究生信息（根据姓名，研究生号）
            else if (OPERATION_SEARCH.equals(in.toUpperCase()) ||
                    OPERATION_SEARCH.substring(0, 1).equals(in.toUpperCase())
                    || OPERATION_SEARCH.equals(prenious)) {
                prenious = OPERATION_SEARCH;
                List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
                Map<String, Object> param = new HashMap<String, Object>();
                if (step == 1) {
                    System.out.println("请输入研究生的[姓名]");
                } else if (step == 2) {
                    param.put("name", "user_name");
                    param.put("rela", "=");
                    param.put("value", in);
                    params.add(param);
                    System.out.println("请输入研究生的[学号]");
                } else if (step == 3) {
                    param.put("name", "studentNo");
                    param.put("rela", "=");
                    param.put("value", in);
                    params.add(param);
                    try {
                        List<Graduate> list = gactin.query(params);
                        if (list.size() == 0) {
                            System.out.println("查询失败！！！");
                            continue;
                        }
                        System.out.println("查询结果：");
                        for (Graduate ge2 : list) {
                            System.out.println(ge2.toString());
                        }
                        // 标记变量还原
                        prenious = null;
                        graduate = null;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("查询失败！！！");
                    }
                }
                if (OPERATION_SEARCH.equals(prenious)) {
                    step++;
                }
            }
            // 查询某位研究生信息
            else if (OPERATION_GET.equals(in.toUpperCase()) ||
                    OPERATION_GET.substring(0, 1).equals(in.toUpperCase())) {
                // 循环查询
                String y_n = "y";
                while (y_n.equals("y")) {
                    System.out.println("请输入该研究生的[学号]");
                    int teacherNo = scan.nextInt();
                    try {
                        Graduate ge = gactin.get(teacherNo);
                        System.out.println(ge.toString());
                        System.out.println("是否要继续查询(y/n)");
                        y_n = scan.next();
                        if (y_n.equals("n")) {
                            System.out.println("已退出该功能！！！");
                        }
                    } catch (Exception e) {
                        // e.printStackTrace();
                        System.out.println("查无此人！！！");
                    }
                }
            }
            // 主菜单
            else if (OPERATION_MAIN.equals(in.toUpperCase()) ||
                    OPERATION_MAIN.substring(0, 1).equals(in.toUpperCase())) {
                System.out.println(CONTEXT);
                continue;
            }
            // 返回上一级
            else if (OPERATION_BREAK.equals(in.toUpperCase()) ||
                    OPERATION_BREAK.substring(0, 1).equals(in.toUpperCase())) {
                System.out.println("您已返回主菜单");
                System.out.println(CONTEXT);
                continue;
            }
        }
    }
}

