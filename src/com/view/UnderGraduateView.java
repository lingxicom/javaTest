package com.view;

import com.action.UnderGraduateAction;
import com.model.UnderGraduate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 视图类
 * 用户交互
 */

public class UnderGraduateView {
    private static final String UGCONTEXT = "本科生服务系统 \n" +
            "[MAIN/M]:主菜单\n" +
            "[QUERY/Q]:查看全部本科生信息\n" +
            "[GET/G]:查看某位本科生的详细信息\n" +
            "[ADD/A]:添加本科生信息\n" +
            "[UPDATE/U]:修改本科生信息\n" +
            "[DELETE/D]:删除本科生信息\n" +
            "[SEARCH/S]:查询本科生信息\n(根据姓名，学号来查询）\n" +
            "[EXIT/E]:退出本科生服务系统\n" +
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
        System.out.println(UGCONTEXT);
        // 保持程序一直运行,循环接受控制台参数
        Scanner scan = new Scanner(System.in);
        // 记忆变量
        String prenious = null;
        // 步骤变量
        Integer step = 1;
        // 全局变量
        UnderGraduate undergradute = new UnderGraduate();
         UnderGraduateAction ugction = new UnderGraduateAction();

        while (scan.hasNext()) {
            String in = scan.next().toString();
            // 退出(输入EXIT或exit或E或e)
            if (OPERATION_EXIT.equals(in.toUpperCase()) ||
                    OPERATION_EXIT.substring(0, 1).equals(in.toUpperCase())) {
                System.out.println("您已成功退出本科生服务系统！");
                break;
            }
            // 添加本科生信息
            else if (OPERATION_ADD.equals(in.toUpperCase()) ||
                    OPERATION_ADD.substring(0, 1).equals(in.toUpperCase())
                    || OPERATION_ADD.equals(prenious)) {
                prenious = OPERATION_ADD;
                if (1 == step) {
                    System.out.println("请输入本科生的[姓名]");
                } else if (2 == step) {
                    undergradute.setUser_name(in);
                    System.out.println("请输入本科生的[身份证号]");
                } else if (3 == step) {
                    undergradute.setId_(Integer.valueOf(in));
                    System.out.println("请输入本科生的[性别]");
                } else if (4 == step) {
                    undergradute.setGender(in);
                    System.out.println("请输入本科生的[生日], 格式如：yyyy-MM-dd");
                } else if (5 == step) {
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                    Date birthday = null;
                    try {
                        birthday = sf.parse(in);
                        undergradute.setBirthday(birthday);
                        System.out.println("请输入本科生的[学号]");
                    } catch (ParseException e) {
                        e.printStackTrace();
                        System.out.println("您输入的格式有误，请重新输入");
                        step = 4;
                    }
                }
                else if (6 == step) {
                    undergradute.setStudentNo(Integer.valueOf(in));
                    System.out.println("请输入本科生的[学校]");
                } else if (7 == step) {
                    undergradute.setSchool(in);
                    System.out.println("请输入本科生的[班级]");
                } else if (8 == step) {
                    undergradute.setClass_(in);
                    System.out.print("请输入本科生的[专业]");
                } else if (9 == step) {
                    undergradute.setMajor(in);
                    try {
                    ugction.add(undergradute);
                    System.out.println("添加本科生信息成功！！");
                    prenious = null;
                    step = 1;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("添加本科生信息失败！！");
                    prenious = null;
                    step = 1;
                }
            }
                if (OPERATION_ADD.equals(prenious)) {
                    step++;
                }

            }
            // 修改本科生信息
            else if (OPERATION_UPDATE.equals(in.toUpperCase()) ||
                    OPERATION_UPDATE.substring(0, 1).equals(in.toUpperCase())
                    || OPERATION_UPDATE.equals(prenious)) {
                prenious = OPERATION_UPDATE;
                if (1 == step) {
                    System.out.println("请输入要修改本科生的[学号]");
                } else if (2 == step) {
                    try {
                        undergradute = ugction.get(Integer.valueOf(in));
                        if (undergradute == null) {
                            System.out.println("学号错误，请重新输入");
                            continue;
                        }
                        System.out.println("请输入要本科生的[姓名]");
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("学号错误，请重新输入");
                        continue;
                    }
                } else if (3 == step) {
                    undergradute.setUser_name(in);
                    System.out.println("请输入本科生的[身份证号]");
                } else if (4 == step) {
                   undergradute.setId_(Integer.valueOf(in));
                    System.out.println("请输入本科生的[性别]");
                } else if (5 == step) {
                    undergradute.setGender(in);
                    System.out.println("请输入本科生的[生日], 格式如：yyyy-MM-dd");
                } else if (6 == step) {
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                    Date birthday = null;
                    try {
                        birthday = sf.parse(in);
                       undergradute.setBirthday(birthday);
                        System.out.println("请输入本科生的[学校]");
                    } catch (ParseException e) {
                        e.printStackTrace();
                        System.out.println("您输入的格式有误，请重新输入");
                        step = 5;
                    }
                } else if (7 == step) {
                   undergradute.setSchool(in);
                    System.out.println("请输入本科生的[部门]");
                } else if (8 == step) {
                    undergradute.setClass_(in);}
                else if (9 == step) {
                    undergradute.setMajor(in);
                    try {
                        ugction.edit(undergradute);
                        System.out.println("修改本科生信息成功！！");
                        prenious = null;
                        step = 1;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("修改本科生信息失败！！");
                        prenious = null;
                        step = 1;
                    }
                }
                if (OPERATION_UPDATE.equals(prenious)) {
                    step++;
                }
            }
            // 删除本科生信息
            else if (OPERATION_DELETE.equals(in.toUpperCase()) ||
                    OPERATION_DELETE.substring(0, 1).equals(in.toUpperCase())) {
                System.out.println("请输入要查询的本科生的[学号]");
                try {
                    Integer no = new Integer(scan.nextInt());
                    ugction.del(no);
                    System.out.println("本科生信息删除成功~");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("本科生信息删除失败~");
                }
            }
            // 查询本科生信息
            else if (OPERATION_QUERY.equals(in.toUpperCase()) ||
                    OPERATION_QUERY.substring(0, 1).equals(in.toUpperCase())) {
                try {
                    List<UnderGraduate> list =ugction.query();
                    // 将查询结果输出
                    for (UnderGraduate ug  : list) {
                        System.out.println("姓名：" + ug .getUser_name() + "," + "学号：" + ug .getStudentNo());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            // 查询本科生信息（根据姓名，学号）
            else if (OPERATION_SEARCH.equals(in.toUpperCase()) ||
                    OPERATION_SEARCH.substring(0, 1).equals(in.toUpperCase())
                    || OPERATION_SEARCH.equals(prenious)) {
                prenious = OPERATION_SEARCH;
                List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
                Map<String, Object> param = new HashMap<String, Object>();
                if (step == 1) {
                    System.out.println("请输入本科生的[姓名]");
                } else if (step == 2) {
                    param.put("name", "user_name");
                    param.put("rela", "=");
                    param.put("value", in);
                    params.add(param);
                    System.out.println("请输入本科生的[学号]");
                } else if (step == 3) {
                    param.put("name", "studentNo");
                    param.put("rela", "=");
                    param.put("value", in);
                    params. add(param);
                    try {
                        List<UnderGraduate> list = ugction.query(params);
                        if (list.size() == 0) {
                            System.out.println("查询失败！！！");
                            continue;
                        }
                        System.out.println("查询结果：");
                        for (UnderGraduate te2 : list) {
                            System.out.println(te2.toString());
                        }
                        // 标记变量还原
                        prenious = null;
                        undergradute = null;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("查询失败！！！");
                    }
                }
                if (OPERATION_SEARCH.equals(prenious)) {
                    step++;
                }
            }
            // 查询某位本科生信息
            else if (OPERATION_GET.equals(in.toUpperCase()) ||
                    OPERATION_GET.substring(0, 1).equals(in.toUpperCase())) {
                // 循环查询
                String y_n = "y";
                while (y_n.equals("y")) {
                    System.out.println("请输入该本科生的[学号]");
                    int studentNo = scan.nextInt();
                    try {
                       UnderGraduate ug  = ugction.get(studentNo);
                        System.out.println(ug .toString());
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
                System.out.println(UGCONTEXT);
                continue;
            }
            else if (OPERATION_BREAK.equals(in.toUpperCase()) ||
                    OPERATION_BREAK.substring(0, 1).equals(in.toUpperCase())) {
                System.out.println("您已返回主菜单");
                System.out.println(UGCONTEXT);
                continue;
            }
       }
    }
}
