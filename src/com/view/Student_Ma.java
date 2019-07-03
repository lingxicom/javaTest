package com.view;

import com.action.GraduateAction;
import com.action.TaAction;
import com.action.TeacherAction;
import com.action.UnderGraduateAction;
import com.model.Graduate;
import com.model.TA;
import com.model.Teacher;
import com.model.UnderGraduate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student_Ma extends JFrame {


    //设置面板背景
    ImageIcon backgrond = new ImageIcon("C:\\Users\\15131\\IdeaProjects\\javaTest\\src\\com\\view\\9dba8adef501079a0d345904a6bc4372.jpeg");
    JLabel back_lable = new JLabel(backgrond);
    JPanel mypanel = new JPanel();

    ImageIcon backgrond1 = new ImageIcon("C:\\Users\\15131\\IdeaProjects\\javaTest\\src\\com\\view\\3jpeg.jpeg");
    JLabel back_lable1 = new JLabel(backgrond1);
    JPanel mypanel1 = new JPanel();

    ImageIcon backgrond2 = new ImageIcon("C:\\Users\\15131\\IdeaProjects\\javaTest\\src\\com\\view\\4.jpeg");
    JLabel back_lable2 = new JLabel(backgrond2);
    JPanel mypanel2 = new JPanel();


    JFrame frm = new JFrame("学生管理系统");
    JFrame frm_delete = new JFrame("信息删除");
    JFrame newjrm = new JFrame("本科生信息查询");
    JFrame frm_add = new JFrame("添加新的学生信息");
    JFrame frm_change = new JFrame("修改学生信息");


    JFrame frm_teachear = new JFrame("教师信息查询");
    JFrame frm_teacher_add = new JFrame("添加新的教师信息；");
    JFrame frm_teachear_delete = new JFrame("删除教师信息");
    JFrame frm_teacher_change = new JFrame("修改教师信息");


    JFrame frm_yanstu = new JFrame("研究生信息查询");
    JFrame frm_yanstu_add = new JFrame("添加新的研究生信息；");
    JFrame frm_yanstu_delete = new JFrame("删除研究生信息");
    JFrame frm_yanstu_change = new JFrame("修改研究生信息");
    JFrame frm_update = new JFrame("修改研究生信息-修改");

    JFrame frm_ta = new JFrame("助教博士生信息查询");
    JFrame frm_ta_add = new JFrame("添加新的助教博士生信息");
    JFrame frm_ta_delete = new JFrame("删除助教博士生信息");
    JFrame frm_ta_change = new JFrame("修改助教博士生信息");


    public static void main(String[] args) {
        Student_Ma ma = new Student_Ma();
    }

    public Student_Ma() {

        //

        back_lable.setBounds(0, 0, 500, 300);
        mypanel = (JPanel) frm.getContentPane();
        mypanel.setOpaque(false);
        mypanel.setLayout(new FlowLayout());
        frm.getLayeredPane().setLayout(null);
        frm.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));


        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JPanel bottomjpanel = new JPanel();
//        frm.add(bottomjpanel,BorderLayout.CENTER);
        frm.setLayout(null);

        //创建菜单栏
        JMenuBar jmenu = new JMenuBar();
        frm.setJMenuBar(jmenu);

        //添加信息列表
        JLabel jl_stu = new JLabel("本科生信息列表");
        JTextArea jta_stu = new JTextArea();
        jta_stu.setRows(10);
        jta_stu.setColumns(20);
        jta_stu.setEditable(false);
//        bottomjpanel.add(jl_stu);
//        bottomjpanel.add(jta_stu);

        //创建学生、教师、研究生的下拉式菜单并添加到菜单栏
        JMenu jm_1 = new JMenu("本科生入口");
        JMenu jm_2 = new JMenu("教师入口");
        JMenu jm_3 = new JMenu("研究生入口");
        JMenu jm_4 = new JMenu("助教博士生入口");

        jmenu.add(jm_1);
        jmenu.add(jm_2);
        jmenu.add(jm_3);
        jmenu.add(jm_4);


        //创建菜单选项并添加到相应的菜单下
        JMenuItem jm_1_1 = new JMenuItem("查询本科生信息");                        //本科生信息
        JMenuItem jm_1_2 = new JMenuItem("添加本科生信息");
        JMenuItem jm_1_3 = new JMenuItem("删除本科生信息");
        JMenuItem jm_1_4 = new JMenuItem("修改本科生信息");
        jm_1.add(jm_1_1);
        jm_1.add(jm_1_2);
        jm_1.add(jm_1_3);
        jm_1.add(jm_1_4);

        JMenuItem jm_2_1 = new JMenuItem("查询教师信息");                         //教师信息
        JMenuItem jm_2_2 = new JMenuItem("添加教师信息");
        JMenuItem jm_2_3 = new JMenuItem("删除教师信息");
        JMenuItem jm_2_4 = new JMenuItem("修改教师信息");
        jm_2.add(jm_2_1);
        jm_2.add(jm_2_2);
        jm_2.add(jm_2_3);
        jm_2.add(jm_2_4);

        JMenuItem jm_3_1 = new JMenuItem("查询研究生信息");                         //研究生信息
        JMenuItem jm_3_2 = new JMenuItem("添加研究生信息");
        JMenuItem jm_3_3 = new JMenuItem("删除研究生信息");
        JMenuItem jm_3_4 = new JMenuItem("修改研究生信息");
        jm_3.add(jm_3_1);
        jm_3.add(jm_3_2);
        jm_3.add(jm_3_3);
        jm_3.add(jm_3_4);

        JMenuItem jm_4_1 = new JMenuItem("查询助教博士生信息");                         //助教博士生信息
        JMenuItem jm_4_2 = new JMenuItem("添加助教博士生信息");
        JMenuItem jm_4_3 = new JMenuItem("删除助教博士生信息");
        JMenuItem jm_4_4 = new JMenuItem("修改助教博士生信息");
        jm_4.add(jm_4_1);
        jm_4.add(jm_4_2);
        jm_4.add(jm_4_3);
        jm_4.add(jm_4_4);

        // 研究生
        jm_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        // 查询
        jm_3_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_yanstu.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_yanstu.getLayeredPane().setLayout(null);
                frm_yanstu.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));

                //创建新的窗口

                JPanel toppanel = new JPanel();
                frm_yanstu.add(toppanel, BorderLayout.NORTH);

                //设置查询标签
                JLabel jl1 = new JLabel("请输入学号");

                //创建信息输入框
                JTextField jt_yan = new JTextField();
                jt_yan.setEditable(true);
                jt_yan.setHorizontalAlignment(SwingConstants.LEFT);
                jt_yan.setColumns(30);

                //创建查询按钮
                JButton jb_search = new JButton("查询");

                //添加显示标签、输入框和搜索按钮
                toppanel.add(jl1);
                toppanel.add(jt_yan);
                toppanel.add(jb_search);

                //创建面板并放在下半部分
                JPanel bottompanel = new JPanel();
                frm_yanstu.add(bottompanel, BorderLayout.CENTER);

                //创建输出框
                JTextArea jta_output = new JTextArea();
                jta_output.setRows(20);
                jta_output.setColumns(30);
                jta_output.setEditable(false);
                //创建输出提醒标签
                JLabel jl_output = new JLabel();
                jl_output.setText("查询结果");


                //底部面板添加标签和输出框
                bottompanel.add(jta_output);
                bottompanel.add(jl_output);

                frm_yanstu.setBounds(400, 250, 500, 400);
                frm_yanstu.setVisible(true);

                //对查询跳转函数并输出
                jb_search.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取输入值
                        int input = Integer.valueOf(jt_yan.getText());
                        // 函数处理
                        // 查询三（单个）
                        GraduateAction action = new GraduateAction();
                        Graduate g2 = null;
                        try {
                            g2 = action.get(input);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        // 打印研究生信息
                        if (g2 == null) {
                            jta_output.setText("查无此人！！");
                        }
                        jta_output.setText(g2.toString());
                    }
                });
            }
        });
        // 添加
        jm_3_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable1.setBounds(0, 0, 500, 700);
                mypanel1 = (JPanel) frm_yanstu_add.getContentPane();
                mypanel1.setOpaque(false);
                mypanel1.setLayout(new FlowLayout());
                frm_yanstu_add.getLayeredPane().setLayout(null);
                frm_yanstu_add.getLayeredPane().add(back_lable1, new Integer(Integer.MIN_VALUE));


                frm_yanstu_add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm_yanstu_add.setBounds(400, 250, 500, 700);
                frm_yanstu_add.setLayout(null);

                //加入新标签
                JLabel jl_user_name, jl_id_, jl_gender, jl_birthday, jl_studentNo, jl_school, jl_class_, jl_direction, jl_advisername;
                jl_user_name = new JLabel("姓名:");
                jl_id_ = new JLabel("身份证号：");
                jl_gender = new JLabel("性别：");
                jl_birthday = new JLabel("生日：");
                jl_studentNo = new JLabel("学号：");
                jl_school = new JLabel("学校：");
                jl_class_ = new JLabel("班级：");
                jl_direction = new JLabel("研究方向：");
                jl_advisername = new JLabel("导师：");
                jl_user_name.setBounds(70, 1, 300, 120);
                jl_id_.setBounds(70, 50, 300, 120);
                jl_gender.setBounds(70, 100, 300, 120);
                jl_birthday.setBounds(70, 150, 300, 120);
                jl_studentNo.setBounds(70, 200, 300, 120);
                jl_school.setBounds(70, 250, 300, 120);
                jl_class_.setBounds(70, 300, 300, 120);
                jl_direction.setBounds(70, 350, 300, 120);
                jl_advisername.setBounds(70, 400, 300, 120);
                frm_yanstu_add.add(jl_user_name);
                frm_yanstu_add.add(jl_id_);
                frm_yanstu_add.add(jl_gender);
                frm_yanstu_add.add(jl_birthday);
                frm_yanstu_add.add(jl_studentNo);
                frm_yanstu_add.add(jl_school);
                frm_yanstu_add.add(jl_class_);
                frm_yanstu_add.add(jl_direction);
                frm_yanstu_add.add(jl_advisername);


                //创建信息的输入框
                JTextField jt_user_name = new JTextField();
                jt_user_name.setEditable(true);
                jt_user_name.setHorizontalAlignment(SwingConstants.LEFT);
                jt_user_name.setBounds(150, 45, 200, 25);
                jt_user_name.addFocusListener(new JTextFieldHintListener(jt_user_name, "如:小李"));

                JTextField jt_id_ = new JTextField();
                jt_id_.setEditable(true);
                jt_id_.setHorizontalAlignment(SwingConstants.LEFT);
                jt_id_.setBounds(150, 95, 200, 25);
                jt_id_.addFocusListener(new JTextFieldHintListener(jt_id_, "18位有效数字"));

                JTextField jt_gender = new JTextField();
                jt_gender.setEditable(true);
                jt_gender.setHorizontalAlignment(SwingConstants.LEFT);
                jt_gender.setBounds(150, 145, 200, 25);
                jt_gender.addFocusListener(new JTextFieldHintListener(jt_gender, "男/女"));

                JTextField jt_birthday = new JTextField();
                jt_birthday.setEditable(true);
                jt_birthday.setHorizontalAlignment(SwingConstants.LEFT);
                jt_birthday.setBounds(150, 195, 200, 25);
                jt_birthday.addFocusListener(new JTextFieldHintListener(jt_birthday, "如:2000-01-01"));

                JTextField jt_studentNo = new JTextField();
                jt_studentNo.setEditable(true);
                jt_studentNo.setHorizontalAlignment(SwingConstants.LEFT);
                jt_studentNo.setBounds(150, 245, 200, 25);
                jt_studentNo.addFocusListener(new JTextFieldHintListener(jt_studentNo, "8位有效数字"));

                JTextField jt_school = new JTextField();
                jt_school.setEditable(true);
                jt_school.setHorizontalAlignment(SwingConstants.LEFT);
                jt_school.setBounds(150, 295, 200, 25);
                jt_school.addFocusListener(new JTextFieldHintListener(jt_school, "如:太原理工大学"));

                JTextField jt_class_ = new JTextField();
                jt_class_.setEditable(true);
                jt_class_.setHorizontalAlignment(SwingConstants.LEFT);
                jt_class_.setBounds(150, 345, 200, 25);
                jt_class_.addFocusListener(new JTextFieldHintListener(jt_class_, "如:软件1840"));

                JTextField jt_direction = new JTextField();
                jt_direction.setEditable(true);
                jt_direction.setHorizontalAlignment(SwingConstants.LEFT);
                jt_direction.setBounds(150, 395, 200, 25);
                jt_direction.addFocusListener(new JTextFieldHintListener(jt_direction, "如:软件工程"));

                JTextField jt_advisername = new JTextField();
                jt_advisername.setEditable(true);
                jt_advisername.setHorizontalAlignment(SwingConstants.LEFT);
                jt_advisername.setBounds(150, 445, 200, 25);
                jt_advisername.addFocusListener(new JTextFieldHintListener(jt_advisername, "如:李老师"));

                //创建按钮
                JButton jb_1 = new JButton("提交");//提交按纽
                jb_1.setBounds(140, 500, 60, 30);
                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取输入信息
                        try {
                            GraduateAction action = new GraduateAction();
                            Graduate g1 = new Graduate();
                            g1.setUser_name(jt_user_name.getText());
                            g1.setId_(Integer.valueOf(jt_id_.getText()));
                            g1.setGender(jt_gender.getText());
                            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                            Date birthday = null;
                            try {
                                birthday = sf.parse(jt_birthday.getText());
                            } catch (ParseException e1) {
                                e1.printStackTrace();
                            }
                            g1.setBirthday(birthday);
                            g1.setStudentNo(Integer.valueOf(jt_studentNo.getText()));
                            g1.setSchool(jt_school.getText());
                            g1.setClass_(jt_class_.getText());
                            g1.setDirection(jt_direction.getText());
                            g1.setAdviserName(jt_advisername.getText());
                            try {
                                action.add(g1);
                                JFrame frm_add_suc = new JFrame("添加成功");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("添加信息成功");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            } catch (Exception e1) {
                                e1.printStackTrace();
                                JFrame frm_add_suc = new JFrame("添加失败");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("添加信息失败");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            JFrame frm_add_suc = new JFrame("添加失败");
                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_add_suc.setBounds(500, 200, 200, 100);
                            frm_add_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("添加信息失败");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_add_suc.add(jl_suc);
                            frm_add_suc.setVisible(true);
                        }
                    }
                });

                JButton jb_2 = new JButton("取消");//取消提交按钮
                jb_2.setBounds(280, 500, 60, 30);
                jb_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm_yanstu_add.dispose();
                    }
                });

                //添加输入框
                frm_yanstu_add.add(jt_user_name);
                frm_yanstu_add.add(jt_id_);
                frm_yanstu_add.add(jt_gender);
                frm_yanstu_add.add(jt_birthday);
                frm_yanstu_add.add(jt_studentNo);
                frm_yanstu_add.add(jt_school);
                frm_yanstu_add.add(jt_class_);
                frm_yanstu_add.add(jt_direction);
                frm_yanstu_add.add(jt_advisername);
                frm_yanstu_add.add(jb_1);
                frm_yanstu_add.add(jb_2);


                frm_yanstu_add.setVisible(true);
            }

        });
        // 删除
        jm_3_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_yanstu_delete.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_yanstu_delete.getLayeredPane().setLayout(null);
                frm_yanstu_delete.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));

                frm_yanstu_delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm_yanstu_delete.setBounds(400, 250, 500, 400);
                frm_yanstu_delete.setLayout(null);

                //设置按钮
                JButton jb_1 = new JButton("确定");
                jb_1.setBounds(170, 60, 60, 30);
                JButton jb_2 = new JButton("取消");
                jb_2.setBounds(270, 60, 60, 30);

                //设置标签
                JLabel jl_delete = new JLabel("输入要删除研究生的学号:");
                jl_delete.setBounds(20, 10, 200, 50);

                //设置输入框
                JTextField jt_delete = new JTextField();
                jt_delete.setBounds(160, 20, 200, 30);
                jt_delete.setEditable(true);
                jt_delete.setHorizontalAlignment(SwingConstants.LEFT);

                //添加入
                frm_yanstu_delete.add(jl_delete);
                frm_yanstu_delete.add(jt_delete);
                frm_yanstu_delete.add(jb_1);
                frm_yanstu_delete.add(jb_2);


                frm_yanstu_delete.setVisible(true);

                //设置确认删除的监听事件
                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取删除信息
                        int input = Integer.valueOf(jt_delete.getText());
                        GraduateAction action = new GraduateAction();
                        try {
                            action.del(input);
                            JFrame frm_suc = new JFrame("删除成功");
                            frm_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_suc.setBounds(500, 200, 200, 100);
                            frm_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("删除信息成功");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_suc.add(jl_suc);
                            frm_suc.setVisible(true);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                            JFrame frm_suc = new JFrame("删除失败");
                            frm_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_suc.setBounds(500, 200, 200, 100);
                            frm_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("删除信息失败");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_suc.add(jl_suc);
                            frm_suc.setVisible(true);
                        }
                    }
                });
            }
        });
        // 修改
        jm_3_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_yanstu_change.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_yanstu_change.getLayeredPane().setLayout(null);
                frm_yanstu_change.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));

                frm_yanstu_change.setBounds(800, 400, 500, 400);
                frm_yanstu_change.setLayout(null);
                JLabel jl_1 = new JLabel("输入要修改的研究生的学号:");
                jl_1.setBounds(140, 50, 200, 50);

                JTextField jt_input_1 = new JTextField();
                jt_input_1.setBounds(140, 100, 200, 30);
                jt_input_1.setEditable(true);
                jt_input_1.setHorizontalAlignment(SwingConstants.LEFT);

                JButton jb_1 = new JButton("确定");
                jb_1.setBounds(120, 280, 70, 30);
                JButton jb_2 = new JButton("取消");
                jb_2.setBounds(280, 280, 70, 30);

                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        GraduateAction action = new GraduateAction();
                        Graduate graduate = new Graduate();
                        int input = Integer.valueOf(jt_input_1.getText());
                        try {
                            graduate = action.get(Integer.valueOf(input));
                            if (graduate == null) {
                                JFrame frm_add_suc = new JFrame("失败");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("学号错误");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            JFrame frm_add_suc = new JFrame("失败");
                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_add_suc.setBounds(500, 200, 200, 100);
                            frm_add_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("学号错误");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_add_suc.add(jl_suc);
                            frm_add_suc.setVisible(true);
                        }
                        String user_name = graduate.getUser_name();
                        int id_ = graduate.getId_();
                        String gender = graduate.getGender();
                        Date birthday = graduate.getBirthday();
                        String school = graduate.getSchool();
                        String class_ = graduate.getClass_();
                        String direction = graduate.getDirection();
                        String advisername = graduate.getAdviserName();

                        // 弹出后修改框
                        Graduate finalGraduate = graduate;
                        jb_1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                back_lable1.setBounds(0, 0, 500, 700);
                                mypanel1 = (JPanel) frm_update.getContentPane();
                                mypanel1.setOpaque(false);
                                mypanel1.setLayout(new FlowLayout());
                                frm_update.getLayeredPane().setLayout(null);
                                frm_update.getLayeredPane().add(back_lable1, new Integer(Integer.MIN_VALUE));

                                frm_update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_update.setBounds(400, 250, 500, 700);
                                frm_update.setLayout(null);

                                //加入新标签
                                JLabel jl_user_name, jl_id_, jl_gender, jl_birthday, jl_school, jl_class_, jl_direction, jl_advisername;
                                jl_user_name = new JLabel("姓名:");
                                jl_id_ = new JLabel("身份证号：");
                                jl_gender = new JLabel("性别：");
                                jl_birthday = new JLabel("生日：");
                                jl_school = new JLabel("学校：");
                                jl_class_ = new JLabel("班级：");
                                jl_direction = new JLabel("研究方向：");
                                jl_advisername = new JLabel("导师：");
                                jl_user_name.setBounds(70, 1, 300, 120);
                                jl_id_.setBounds(70, 50, 300, 120);
                                jl_gender.setBounds(70, 100, 300, 120);
                                jl_birthday.setBounds(70, 150, 300, 120);
                                jl_school.setBounds(70, 200, 300, 120);
                                jl_class_.setBounds(70, 250, 300, 120);
                                jl_direction.setBounds(70, 300, 300, 120);
                                jl_advisername.setBounds(70, 350, 300, 120);
                                frm_update.add(jl_user_name);
                                frm_update.add(jl_id_);
                                frm_update.add(jl_gender);
                                frm_update.add(jl_birthday);
                                frm_update.add(jl_school);
                                frm_update.add(jl_class_);
                                frm_update.add(jl_direction);
                                frm_update.add(jl_advisername);


                                //创建信息的输入框
                                JTextField jt_user_name = new JTextField();
                                jt_user_name.setEditable(true);
                                jt_user_name.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_user_name.setBounds(150, 45, 200, 25);
                                jt_user_name.addFocusListener(new JTextFieldHintListener(jt_user_name, user_name));

                                JTextField jt_id_ = new JTextField();
                                jt_id_.setEditable(true);
                                jt_id_.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_id_.setBounds(150, 95, 200, 25);
                                jt_id_.addFocusListener(new JTextFieldHintListener(jt_id_, String.valueOf(id_)));

                                JTextField jt_gender = new JTextField();
                                jt_gender.setEditable(true);
                                jt_gender.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_gender.setBounds(150, 145, 200, 25);
                                jt_gender.addFocusListener(new JTextFieldHintListener(jt_gender, gender));

                                JTextField jt_birthday = new JTextField();
                                jt_birthday.setEditable(true);
                                jt_birthday.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_birthday.setBounds(150, 195, 200, 25);
                                jt_birthday.addFocusListener(new JTextFieldHintListener(jt_birthday, String.valueOf(birthday)));

                                JTextField jt_school = new JTextField();
                                jt_school.setEditable(true);
                                jt_school.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_school.setBounds(150, 245, 200, 25);
                                jt_school.addFocusListener(new JTextFieldHintListener(jt_school, school));

                                JTextField jt_class_ = new JTextField();
                                jt_class_.setEditable(true);
                                jt_class_.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_class_.setBounds(150, 295, 200, 25);
                                jt_class_.addFocusListener(new JTextFieldHintListener(jt_class_, class_));

                                JTextField jt_direction = new JTextField();
                                jt_direction.setEditable(true);
                                jt_direction.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_direction.setBounds(150, 345, 200, 25);
                                jt_direction.addFocusListener(new JTextFieldHintListener(jt_direction, direction));

                                JTextField jt_advisername = new JTextField();
                                jt_advisername.setEditable(true);
                                jt_advisername.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_advisername.setBounds(150, 395, 200, 25);
                                jt_advisername.addFocusListener(new JTextFieldHintListener(jt_advisername, advisername));

                                //创建按钮
                                JButton jb_1 = new JButton("提交");//提交按纽
                                jb_1.setBounds(140, 500, 60, 30);
                                jb_1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        // 获取输入信息
                                        try {
                                            GraduateAction action = new GraduateAction();
                                            Graduate g1 = new Graduate();
                                            finalGraduate.setUser_name(jt_user_name.getText());
                                            finalGraduate.setId_(Integer.valueOf(jt_id_.getText()));
                                            finalGraduate.setGender(jt_gender.getText());
                                            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                                            Date birthday = null;
                                            try {
                                                birthday = sf.parse(jt_birthday.getText());
                                            } catch (ParseException e1) {
                                                e1.printStackTrace();
                                            }
                                            finalGraduate.setBirthday(birthday);
                                            finalGraduate.setSchool(jt_school.getText());
                                            finalGraduate.setClass_(jt_class_.getText());
                                            finalGraduate.setDirection(jt_direction.getText());
                                            finalGraduate.setAdviserName(jt_advisername.getText());
                                            try {
                                                action.edit(finalGraduate);
                                                JFrame frm_add_suc = new JFrame("修改成功");
                                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                frm_add_suc.setBounds(500, 200, 200, 100);
                                                frm_add_suc.setLayout(null);
                                                //设置标签
                                                JLabel jl_suc = new JLabel("修改信息成功");
                                                jl_suc.setBounds(50, 20, 120, 20);
                                                //添加入面板
                                                frm_add_suc.add(jl_suc);
                                                frm_add_suc.setVisible(true);
                                            } catch (Exception e1) {
                                                e1.printStackTrace();
                                                JFrame frm_add_suc = new JFrame("修改失败");
                                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                frm_add_suc.setBounds(500, 200, 200, 100);
                                                frm_add_suc.setLayout(null);
                                                //设置标签
                                                JLabel jl_suc = new JLabel("修改信息失败");
                                                jl_suc.setBounds(50, 20, 120, 20);
                                                //添加入面板
                                                frm_add_suc.add(jl_suc);
                                                frm_add_suc.setVisible(true);
                                            }
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                            JFrame frm_add_suc = new JFrame("修改失败");
                                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            frm_add_suc.setBounds(500, 200, 200, 100);
                                            frm_add_suc.setLayout(null);
                                            //设置标签
                                            JLabel jl_suc = new JLabel("修改信息失败");
                                            jl_suc.setBounds(50, 20, 120, 20);
                                            //添加入面板
                                            frm_add_suc.add(jl_suc);
                                            frm_add_suc.setVisible(true);
                                        }
                                    }
                                });

                                JButton jb_2 = new JButton("取消");//取消提交按钮
                                jb_2.setBounds(280, 500, 60, 30);
                                jb_2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        frm_update.dispose();
                                    }
                                });

                                //添加输入框
                                frm_update.add(jt_user_name);
                                frm_update.add(jt_id_);
                                frm_update.add(jt_gender);
                                frm_update.add(jt_birthday);
                                frm_update.add(jt_school);
                                frm_update.add(jt_class_);
                                frm_update.add(jt_direction);
                                frm_update.add(jt_advisername);
                                frm_update.add(jb_1);
                                frm_update.add(jb_2);


                                frm_update.setVisible(true);
                            }

                        });
                    }
                });

                jb_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm_yanstu_add.dispose();
                    }
                });

                //添加
                frm_yanstu_change.add(jl_1);
                frm_yanstu_change.add(jt_input_1);
                frm_yanstu_change.add(jb_1);
                frm_yanstu_change.add(jb_2);
                frm_yanstu_change.setVisible(true);
            }
        });


        //教师信息
        jm_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        // 查询
        jm_2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_teachear.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_teachear.getLayeredPane().setLayout(null);
                frm_teachear.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));

                //创建新的窗口

                JPanel toppanel = new JPanel();
                frm_teachear.add(toppanel, BorderLayout.NORTH);

                //设置查询标签
                JLabel jl1 = new JLabel("请输入教师号");

                //创建信息输入框
                JTextField jt_tea = new JTextField();
                jt_tea.setEditable(true);
                jt_tea.setHorizontalAlignment(SwingConstants.LEFT);
                jt_tea.setColumns(30);

                //创建查询按钮
                JButton jb_search = new JButton("查询");

                //添加显示标签、输入框和搜索按钮
                toppanel.add(jl1);
                toppanel.add(jt_tea);
                toppanel.add(jb_search);

                //创建面板并放在下半部分
                JPanel bottompanel = new JPanel();
                frm_teachear.add(bottompanel, BorderLayout.CENTER);

                //创建输出框
                JTextArea jta_output = new JTextArea();
                jta_output.setRows(20);
                jta_output.setColumns(30);
                jta_output.setEditable(false);
                //创建输出提醒标签
                JLabel jl_output = new JLabel();
                jl_output.setText("查询结果");

                //底部面板添加标签和输出框
                bottompanel.add(jta_output);
                bottompanel.add(jl_output);

                frm_teachear.setBounds(400, 250, 500, 400);
                frm_teachear.setVisible(true);

                //对查询跳转函数并输出
                jb_search.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取输入值
                        int input = Integer.valueOf(jt_tea.getText());
                        // 函数处理
                        // 查询三（单个）
                        TeacherAction taction = new TeacherAction();
                        Teacher t1 = null;
                        try {
                            t1 = taction.get(input);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        // 打印教师信息
                        if (t1 == null) {
                            jta_output.setText("查无此人！！");
                        }
                        jta_output.setText(t1.toString());
                    }
                });
            }
        });
        // 添加
        jm_2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable1.setBounds(0, 0, 500, 700);
                mypanel1 = (JPanel) frm_teacher_add.getContentPane();
                mypanel1.setOpaque(false);
                mypanel1.setLayout(new FlowLayout());
                frm_teacher_add.getLayeredPane().setLayout(null);
                frm_teacher_add.getLayeredPane().add(back_lable1, new Integer(Integer.MIN_VALUE));

                frm_add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm_teacher_add.setBounds(400, 250, 500, 700);
                frm_teacher_add.setLayout(null);

                //加入新标签
                JLabel jl_user_name, jl_id_, jl_gender, jl_birthday, jl_teacherNo, jl_schoolName, jl_department;
                jl_user_name = new JLabel("姓名:");
                jl_id_ = new JLabel("身份证号：");
                jl_gender = new JLabel("性别：");
                jl_birthday = new JLabel("生日：");
                jl_teacherNo = new JLabel("教师号：");
                jl_schoolName = new JLabel("学校：");
                jl_department = new JLabel("部门：");
                jl_user_name.setBounds(70, 1, 300, 120);
                jl_id_.setBounds(70, 50, 300, 120);
                jl_gender.setBounds(70, 100, 300, 120);
                jl_birthday.setBounds(70, 150, 300, 120);
                jl_teacherNo.setBounds(70, 200, 300, 120);
                jl_schoolName.setBounds(70, 250, 300, 120);
                jl_department.setBounds(70, 300, 300, 120);
                frm_yanstu_add.add(jl_user_name);
                frm_yanstu_add.add(jl_id_);
                frm_yanstu_add.add(jl_gender);
                frm_yanstu_add.add(jl_birthday);
                frm_yanstu_add.add(jl_teacherNo);
                frm_yanstu_add.add(jl_schoolName);
                frm_yanstu_add.add(jl_department);


                //创建信息的输入框
                JTextField jt_user_name = new JTextField();
                jt_user_name.setEditable(true);
                jt_user_name.setHorizontalAlignment(SwingConstants.LEFT);
                jt_user_name.setBounds(150, 45, 200, 25);
                jt_user_name.addFocusListener(new JTextFieldHintListener(jt_user_name, "如:小李"));

                JTextField jt_id_ = new JTextField();
                jt_id_.setEditable(true);
                jt_id_.setHorizontalAlignment(SwingConstants.LEFT);
                jt_id_.setBounds(150, 95, 200, 25);
                jt_id_.addFocusListener(new JTextFieldHintListener(jt_id_, "18位有效数字"));

                JTextField jt_gender = new JTextField();
                jt_gender.setEditable(true);
                jt_gender.setHorizontalAlignment(SwingConstants.LEFT);
                jt_gender.setBounds(150, 145, 200, 25);
                jt_gender.addFocusListener(new JTextFieldHintListener(jt_gender, "男/女"));

                JTextField jt_birthday = new JTextField();
                jt_birthday.setEditable(true);
                jt_birthday.setHorizontalAlignment(SwingConstants.LEFT);
                jt_birthday.setBounds(150, 195, 200, 25);
                jt_birthday.addFocusListener(new JTextFieldHintListener(jt_birthday, "如:2000-01-01"));

                JTextField jt_teacherNo = new JTextField();
                jt_teacherNo.setEditable(true);
                jt_teacherNo.setHorizontalAlignment(SwingConstants.LEFT);
                jt_teacherNo.setBounds(150, 245, 200, 25);
                jt_teacherNo.addFocusListener(new JTextFieldHintListener(jt_teacherNo, "8位有效数字"));

                JTextField jt_schoolName = new JTextField();
                jt_schoolName.setEditable(true);
                jt_schoolName.setHorizontalAlignment(SwingConstants.LEFT);
                jt_schoolName.setBounds(150, 295, 200, 25);
                jt_schoolName.addFocusListener(new JTextFieldHintListener(jt_schoolName, "如:太原理工大学"));

                JTextField jt_department = new JTextField();
                jt_department.setEditable(true);
                jt_department.setHorizontalAlignment(SwingConstants.LEFT);
                jt_department.setBounds(150, 345, 200, 25);
                jt_department.addFocusListener(new JTextFieldHintListener(jt_department, "如:大数据学院"));


                //创建按钮
                JButton jb_1 = new JButton("提交");//提交按纽
                jb_1.setBounds(140, 500, 60, 30);
                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取输入信息
                        try {
                            TeacherAction taction = new TeacherAction();
                            Teacher t2 = new Teacher();
                            t2.setUser_name(jt_user_name.getText());
                            t2.setId_(Integer.valueOf(jt_id_.getText()));
                            t2.setGender(jt_gender.getText());
                            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                            Date birthday = null;
                            try {
                                birthday = sf.parse(jt_birthday.getText());
                            } catch (ParseException e1) {
                                e1.printStackTrace();
                            }
                            t2.setBirthday(birthday);
                            t2.setTeacherNo(Integer.valueOf(jt_teacherNo.getText()));
                            t2.setSchoolName(jt_schoolName.getText());
                            t2.setDepartment(jt_department.getText());
                            try {
                                taction.add(t2);
                                JFrame frm_add_suc = new JFrame("添加成功");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("添加信息成功");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            } catch (Exception e1) {
                                e1.printStackTrace();
                                JFrame frm_add_suc = new JFrame("添加失败");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("添加信息失败");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            JFrame frm_add_suc = new JFrame("添加失败");
                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_add_suc.setBounds(500, 200, 200, 100);
                            frm_add_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("添加信息失败");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_add_suc.add(jl_suc);
                            frm_add_suc.setVisible(true);
                        }
                    }
                });

                JButton jb_2 = new JButton("取消");//取消提交按钮
                jb_2.setBounds(280, 500, 60, 30);
                jb_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm_yanstu_add.dispose();
                    }
                });

                //添加输入框
                frm_teacher_add.add(jt_user_name);
                frm_teacher_add.add(jt_id_);
                frm_teacher_add.add(jt_gender);
                frm_teacher_add.add(jt_birthday);
                frm_teacher_add.add(jt_teacherNo);
                frm_teacher_add.add(jt_schoolName);
                frm_teacher_add.add(jt_department);
                frm_teacher_add.add(jb_1);
                frm_teacher_add.add(jb_2);
                frm_teacher_add.setVisible(true);
            }
        });
        // 删除
        jm_2_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_teachear_delete.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_teachear_delete.getLayeredPane().setLayout(null);
                frm_teachear_delete.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));

                frm_teachear_delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm_teachear_delete.setBounds(400, 250, 500, 400);
                frm_teachear_delete.setLayout(null);

                //设置按钮
                JButton jb_1 = new JButton("确定");
                jb_1.setBounds(170, 60, 60, 30);
                JButton jb_2 = new JButton("取消");
                jb_2.setBounds(270, 60, 60, 30);


                //设置标签
                JLabel jl_delete = new JLabel("输入要删除学生的学号:");
                jl_delete.setBounds(20, 10, 200, 50);

                //设置输入框
                JTextField jt_delete = new JTextField();
                jt_delete.setBounds(160, 20, 200, 30);
                jt_delete.setEditable(true);
                jt_delete.setHorizontalAlignment(SwingConstants.LEFT);

                //添加入
                frm_teachear_delete.add(jl_delete);
                frm_teachear_delete.add(jt_delete);
                frm_teachear_delete.add(jb_1);
                frm_teachear_delete.add(jb_2);

                frm_teachear_delete.setVisible(true);

                //设置确认删除的监听事件
                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取删除信息
                        int input = Integer.valueOf(jt_delete.getText());
                        TeacherAction taction = new TeacherAction();
                        try {
                            taction.del(input);
                            JFrame frm_suc = new JFrame("删除成功");
                            frm_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_suc.setBounds(500, 200, 200, 100);
                            frm_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("删除信息成功");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_suc.add(jl_suc);
                            frm_suc.setVisible(true);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                            JFrame frm_suc = new JFrame("删除失败");
                            frm_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_suc.setBounds(500, 200, 200, 100);
                            frm_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("删除信息失败");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_suc.add(jl_suc);
                            frm_suc.setVisible(true);
                        }
                    }
                });
            }
        });
        // 修改
        jm_2_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_teacher_change.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_teacher_change.getLayeredPane().setLayout(null);
                frm_teacher_change.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));

                frm_teacher_change.setBounds(800, 400, 500, 400);
                frm_teacher_change.setLayout(null);
                JLabel jl_1 = new JLabel("输入要修改的教师的教师号:");
                jl_1.setBounds(140, 50, 200, 50);

                JTextField jt_input_1 = new JTextField();
                jt_input_1.setBounds(140, 100, 200, 30);
                jt_input_1.setEditable(true);
                jt_input_1.setHorizontalAlignment(SwingConstants.LEFT);

                JButton jb_1 = new JButton("确定");
                jb_1.setBounds(120, 280, 70, 30);
                JButton jb_2 = new JButton("取消");
                jb_2.setBounds(280, 280, 70, 30);

                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        TeacherAction taction = new TeacherAction();
                        Teacher teacher = new Teacher();
                        int input = Integer.valueOf(jt_input_1.getText());
                        try {
                            teacher = taction.get(Integer.valueOf(input));
                            if (teacher == null) {
                                JFrame frm_add_suc = new JFrame("失败");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("教师错误");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            JFrame frm_add_suc = new JFrame("失败");
                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_add_suc.setBounds(500, 200, 200, 100);
                            frm_add_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("教师号错误");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_add_suc.add(jl_suc);
                            frm_add_suc.setVisible(true);
                        }
                        String user_name = teacher.getUser_name();
                        int id_ = teacher.getId_();
                        String gender = teacher.getGender();
                        Date birthday = teacher.getBirthday();
                        String schoolName = teacher.getSchoolName();
                        String department = teacher.getDepartment();

                        // 弹出后修改框
                        Teacher finalTeacher = teacher;
                        jb_1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                back_lable1.setBounds(0, 0, 500, 700);
                                mypanel1 = (JPanel) frm_update.getContentPane();
                                mypanel1.setOpaque(false);
                                mypanel1.setLayout(new FlowLayout());
                                frm_update.getLayeredPane().setLayout(null);
                                frm_update.getLayeredPane().add(back_lable1, new Integer(Integer.MIN_VALUE));

                                frm_update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_update.setBounds(400, 250, 500, 700);
                                frm_update.setLayout(null);

                                //加入新标签
                                JLabel jl_user_name, jl_id_, jl_gender, jl_birthday, jl_schoolName, jl_department;
                                jl_user_name = new JLabel("姓名:");
                                jl_id_ = new JLabel("身份证号：");
                                jl_gender = new JLabel("性别：");
                                jl_birthday = new JLabel("生日：");
                                jl_schoolName = new JLabel("学校：");
                                jl_department = new JLabel("班级：");
                                jl_user_name.setBounds(70, 1, 300, 120);
                                jl_id_.setBounds(70, 50, 300, 120);
                                jl_gender.setBounds(70, 100, 300, 120);
                                jl_birthday.setBounds(70, 150, 300, 120);
                                jl_schoolName.setBounds(70, 200, 300, 120);
                                jl_department.setBounds(70, 250, 300, 120);
                                frm_update.add(jl_user_name);
                                frm_update.add(jl_id_);
                                frm_update.add(jl_gender);
                                frm_update.add(jl_birthday);
                                frm_update.add(jl_schoolName);
                                frm_update.add(jl_department);

                                //创建信息的输入框
                                JTextField jt_user_name = new JTextField();
                                jt_user_name.setEditable(true);
                                jt_user_name.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_user_name.setBounds(150, 45, 200, 25);
                                jt_user_name.addFocusListener(new JTextFieldHintListener(jt_user_name, user_name));

                                JTextField jt_id_ = new JTextField();
                                jt_id_.setEditable(true);
                                jt_id_.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_id_.setBounds(150, 95, 200, 25);
                                jt_id_.addFocusListener(new JTextFieldHintListener(jt_id_, String.valueOf(id_)));

                                JTextField jt_gender = new JTextField();
                                jt_gender.setEditable(true);
                                jt_gender.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_gender.setBounds(150, 145, 200, 25);
                                jt_gender.addFocusListener(new JTextFieldHintListener(jt_gender, gender));

                                JTextField jt_birthday = new JTextField();
                                jt_birthday.setEditable(true);
                                jt_birthday.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_birthday.setBounds(150, 195, 200, 25);
                                jt_birthday.addFocusListener(new JTextFieldHintListener(jt_birthday, String.valueOf(birthday)));

                                JTextField jt_schoolName = new JTextField();
                                jt_schoolName.setEditable(true);
                                jt_schoolName.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_schoolName.setBounds(150, 245, 200, 25);
                                jt_schoolName.addFocusListener(new JTextFieldHintListener(jt_schoolName, schoolName));

                                JTextField jt_department = new JTextField();
                                jt_department.setEditable(true);
                                jt_department.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_department.setBounds(150, 295, 200, 25);
                                jt_department.addFocusListener(new JTextFieldHintListener(jt_department, department));


                                //创建按钮
                                JButton jb_1 = new JButton("提交");//提交按纽
                                jb_1.setBounds(140, 500, 60, 30);
                                jb_1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        // 获取输入信息
                                        try {
                                            TeacherAction taction = new TeacherAction();
                                            Teacher t3 = new Teacher();
                                            finalTeacher.setUser_name(jt_user_name.getText());
                                            finalTeacher.setId_(Integer.valueOf(jt_id_.getText()));
                                            finalTeacher.setGender(jt_gender.getText());
                                            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                                            Date birthday = null;
                                            try {
                                                birthday = sf.parse(jt_birthday.getText());
                                            } catch (ParseException e1) {
                                                e1.printStackTrace();
                                            }
                                            finalTeacher.setBirthday(birthday);
                                            finalTeacher.setSchoolName(jt_schoolName.getText());
                                            finalTeacher.setDepartment(jt_department.getText());
                                            try {
                                                taction.edit(finalTeacher);
                                                JFrame frm_add_suc = new JFrame("修改成功");
                                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                frm_add_suc.setBounds(500, 200, 200, 100);
                                                frm_add_suc.setLayout(null);
                                                //设置标签
                                                JLabel jl_suc = new JLabel("修改信息成功");
                                                jl_suc.setBounds(50, 20, 120, 20);
                                                //添加入面板
                                                frm_add_suc.add(jl_suc);
                                                frm_add_suc.setVisible(true);
                                            } catch (Exception e1) {
                                                e1.printStackTrace();
                                                JFrame frm_add_suc = new JFrame("修改失败");
                                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                frm_add_suc.setBounds(500, 200, 200, 100);
                                                frm_add_suc.setLayout(null);
                                                //设置标签
                                                JLabel jl_suc = new JLabel("修改信息失败");
                                                jl_suc.setBounds(50, 20, 120, 20);
                                                //添加入面板
                                                frm_add_suc.add(jl_suc);
                                                frm_add_suc.setVisible(true);
                                            }
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                            JFrame frm_add_suc = new JFrame("修改失败");
                                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            frm_add_suc.setBounds(500, 200, 200, 100);
                                            frm_add_suc.setLayout(null);
                                            //设置标签
                                            JLabel jl_suc = new JLabel("修改信息失败");
                                            jl_suc.setBounds(50, 20, 120, 20);
                                            //添加入面板
                                            frm_add_suc.add(jl_suc);
                                            frm_add_suc.setVisible(true);
                                        }
                                    }
                                });

                                JButton jb_2 = new JButton("取消");//取消提交按钮
                                jb_2.setBounds(280, 500, 60, 30);
                                jb_2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        frm_update.dispose();
                                    }
                                });

                                //添加输入框
                                frm_update.add(jt_user_name);
                                frm_update.add(jt_id_);
                                frm_update.add(jt_gender);
                                frm_update.add(jt_birthday);
                                frm_update.add(jt_schoolName);
                                frm_update.add(jt_department);
                                frm_update.add(jb_1);
                                frm_update.add(jb_2);


                                frm_update.setVisible(true);
                            }

                        });
                    }
                });

                jb_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm_yanstu_add.dispose();
                    }
                });

                //添加
                frm_teacher_change.add(jl_1);
                frm_teacher_change.add(jt_input_1);
                frm_teacher_change.add(jb_1);
                frm_teacher_change.add(jb_2);

                frm_teacher_change.setVisible(true);
            }
        });


        //本科生信息
        jm_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        // 查询
        jm_1_1.addActionListener(new ActionListener() {                          //本科生查询的监听事件
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) newjrm.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                newjrm.getLayeredPane().setLayout(null);
                newjrm.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));

                //创建新的窗口
                JPanel toppanel = new JPanel();
                newjrm.add(toppanel, BorderLayout.NORTH);

                //设置查询标签
                JLabel jl1 = new JLabel("请输入查询");

                //创建信息输入框
                JTextField jt_stu = new JTextField();
                jt_stu.setEditable(true);
                jt_stu.setHorizontalAlignment(SwingConstants.LEFT);
                jt_stu.setColumns(30);

                //创建查询按钮
                JButton jb_search = new JButton("查询");

                //添加显示标签、输入框和搜索按钮
                toppanel.add(jl1);
                toppanel.add(jt_stu);
                toppanel.add(jb_search);

                //创建面板并放在下半部分
                JPanel bottompanel = new JPanel();
                newjrm.add(bottompanel, BorderLayout.CENTER);

                //创建输出框
                JTextArea jta_output = new JTextArea();
                jta_output.setRows(20);
                jta_output.setColumns(30);
                jta_output.setEditable(false);
                //创建输出提醒标签
                JLabel jl_output = new JLabel();
                jl_output.setText("查询结果");

                //底部面板添加标签和输出框
                bottompanel.add(jta_output);
                bottompanel.add(jl_output);

                newjrm.setBounds(400, 250, 500, 400);
                newjrm.setVisible(true);

                //对查询跳转函数并输出
                jb_search.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取输入值
                        int input = Integer.valueOf(jt_stu.getText());
                        // 函数处理
                        // 查询三（单个）
                        UnderGraduateAction uaction = new UnderGraduateAction();
                        UnderGraduate ug1 = null;
                        try {
                            ug1 = uaction.get(input);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        // 打印本科生信息
                        if (ug1 == null) {
                            jta_output.setText("查无此人！！");
                        }
                        jta_output.setText(ug1.toString());
                    }
                });
            }
        });
        // 添加
        jm_1_2.addActionListener(new ActionListener() {                             //本科生信息添加的信息监听事件
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable1.setBounds(0, 0, 500, 700);
                mypanel1 = (JPanel) frm_add.getContentPane();
                mypanel1.setOpaque(false);
                mypanel1.setLayout(new FlowLayout());
                frm_add.getLayeredPane().setLayout(null);
                frm_add.getLayeredPane().add(back_lable1, new Integer(Integer.MIN_VALUE));

                //创建新的窗口

                frm_add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm_add.setBounds(400, 250, 500, 700);
                frm_add.setLayout(null);

                //加入新标签
                JLabel jl_user_name, jl_id_, jl_gender, jl_birthday, jl_studentNo, jl_school, jl_class_, jl_major;
                jl_user_name = new JLabel("姓名:");
                jl_id_ = new JLabel("身份证号：");
                jl_gender = new JLabel("性别：");
                jl_birthday = new JLabel("生日：");
                jl_studentNo = new JLabel("学号：");
                jl_school = new JLabel("学校：");
                jl_class_ = new JLabel("班级：");
                jl_major = new JLabel("研究方向：");
                jl_user_name.setBounds(70, 1, 300, 120);
                jl_id_.setBounds(70, 50, 300, 120);
                jl_gender.setBounds(70, 100, 300, 120);
                jl_birthday.setBounds(70, 150, 300, 120);
                jl_studentNo.setBounds(70, 200, 300, 120);
                jl_school.setBounds(70, 250, 300, 120);
                jl_class_.setBounds(70, 300, 300, 120);
                jl_major.setBounds(70, 350, 300, 120);
                ;
                frm_add.add(jl_user_name);
                frm_add.add(jl_id_);
                frm_add.add(jl_gender);
                frm_add.add(jl_birthday);
                frm_add.add(jl_studentNo);
                frm_add.add(jl_school);
                frm_add.add(jl_class_);
                frm_add.add(jl_major);


                //创建信息的输入框
                JTextField jt_user_name = new JTextField();
                jt_user_name.setEditable(true);
                jt_user_name.setHorizontalAlignment(SwingConstants.LEFT);
                jt_user_name.setBounds(150, 45, 200, 25);
                jt_user_name.addFocusListener(new JTextFieldHintListener(jt_user_name, "如:小李"));

                JTextField jt_id_ = new JTextField();
                jt_id_.setEditable(true);
                jt_id_.setHorizontalAlignment(SwingConstants.LEFT);
                jt_id_.setBounds(150, 95, 200, 25);
                jt_id_.addFocusListener(new JTextFieldHintListener(jt_id_, "18位有效数字"));

                JTextField jt_gender = new JTextField();
                jt_gender.setEditable(true);
                jt_gender.setHorizontalAlignment(SwingConstants.LEFT);
                jt_gender.setBounds(150, 145, 200, 25);
                jt_gender.addFocusListener(new JTextFieldHintListener(jt_gender, "男/女"));

                JTextField jt_birthday = new JTextField();
                jt_birthday.setEditable(true);
                jt_birthday.setHorizontalAlignment(SwingConstants.LEFT);
                jt_birthday.setBounds(150, 195, 200, 25);
                jt_birthday.addFocusListener(new JTextFieldHintListener(jt_birthday, "如:2000-01-01"));

                JTextField jt_studentNo = new JTextField();
                jt_studentNo.setEditable(true);
                jt_studentNo.setHorizontalAlignment(SwingConstants.LEFT);
                jt_studentNo.setBounds(150, 245, 200, 25);
                jt_studentNo.addFocusListener(new JTextFieldHintListener(jt_studentNo, "8位有效数字"));

                JTextField jt_school = new JTextField();
                jt_school.setEditable(true);
                jt_school.setHorizontalAlignment(SwingConstants.LEFT);
                jt_school.setBounds(150, 295, 200, 25);
                jt_school.addFocusListener(new JTextFieldHintListener(jt_school, "如:太原理工大学"));

                JTextField jt_class_ = new JTextField();
                jt_class_.setEditable(true);
                jt_class_.setHorizontalAlignment(SwingConstants.LEFT);
                jt_class_.setBounds(150, 345, 200, 25);
                jt_class_.addFocusListener(new JTextFieldHintListener(jt_class_, "如:软件1840"));

                JTextField jt_major = new JTextField();
                jt_major.setEditable(true);
                jt_major.setHorizontalAlignment(SwingConstants.LEFT);
                jt_major.setBounds(150, 395, 200, 25);
                jt_major.addFocusListener(new JTextFieldHintListener(jt_major, "如:软件工程"));


                //创建按钮
                JButton jb_1 = new JButton("提交");//提交按纽
                jb_1.setBounds(140, 500, 60, 30);
                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取输入信息
                        try {
                            UnderGraduateAction uaction = new UnderGraduateAction();
                            UnderGraduate ug2 = new UnderGraduate();
                            ug2.setUser_name(jt_user_name.getText());
                            ug2.setId_(Integer.valueOf(jt_id_.getText()));
                            ug2.setGender(jt_gender.getText());
                            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                            Date birthday = null;
                            try {
                                birthday = sf.parse(jt_birthday.getText());
                            } catch (ParseException e1) {
                                e1.printStackTrace();
                            }
                            ug2.setBirthday(birthday);
                            ug2.setStudentNo(Integer.valueOf(jt_studentNo.getText()));
                            ug2.setSchool(jt_school.getText());
                            ug2.setClass_(jt_class_.getText());
                            ug2.setMajor(jt_major.getText());
                            try {
                                uaction.add(ug2);
                                JFrame frm_add_suc = new JFrame("添加成功");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("添加信息成功");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            } catch (Exception e1) {
                                e1.printStackTrace();
                                JFrame frm_add_suc = new JFrame("添加失败");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("添加信息失败");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            JFrame frm_add_suc = new JFrame("添加失败");
                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_add_suc.setBounds(500, 200, 200, 100);
                            frm_add_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("添加信息失败");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_add_suc.add(jl_suc);
                            frm_add_suc.setVisible(true);
                        }
                    }
                });

                JButton jb_2 = new JButton("取消");//取消提交按钮
                jb_2.setBounds(280, 500, 60, 30);
                jb_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm_add.dispose();
                    }
                });

                //添加输入框
                frm_add.add(jt_user_name);
                frm_add.add(jt_id_);
                frm_add.add(jt_gender);
                frm_add.add(jt_birthday);
                frm_add.add(jt_studentNo);
                frm_add.add(jt_school);
                frm_add.add(jt_class_);
                frm_add.add(jt_major);
                frm_add.add(jb_1);
                frm_add.add(jb_2);

                frm_add.setVisible(true);
            }
        });
        // 删除
        jm_1_3.addActionListener(new ActionListener() {                                 //本科生删除的监听事件

            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_delete.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_delete.getLayeredPane().setLayout(null);
                frm_delete.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));


                frm_delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm_delete.setBounds(400, 250, 500, 400);
                frm_delete.setLayout(null);

                //设置按钮
                JButton jb_1 = new JButton("确定");
                jb_1.setBounds(170, 60, 60, 30);
                JButton jb_2 = new JButton("取消");
                jb_2.setBounds(270, 60, 60, 30);

                //设置标签
                JLabel jl_delete = new JLabel("输入要删除本科生的学号:");
                jl_delete.setBounds(20, 10, 200, 50);

                //设置输入框
                JTextField jt_delete = new JTextField();
                jt_delete.setBounds(160, 20, 200, 30);
                jt_delete.setEditable(true);
                jt_delete.setHorizontalAlignment(SwingConstants.LEFT);

                //添加入
                frm_delete.add(jl_delete);
                frm_delete.add(jt_delete);
                frm_delete.add(jb_1);
                frm_delete.add(jb_2);


                frm_delete.setVisible(true);

                //设置确认删除的监听事件
                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取删除信息
                        int input = Integer.valueOf(jt_delete.getText());
                        UnderGraduateAction uaction = new UnderGraduateAction();
                        try {
                            uaction.del(input);
                            JFrame frm_suc = new JFrame("删除成功");
                            frm_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_suc.setBounds(500, 200, 200, 100);
                            frm_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("删除信息成功");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_suc.add(jl_suc);
                            frm_suc.setVisible(true);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                            JFrame frm_suc = new JFrame("删除失败");
                            frm_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_suc.setBounds(500, 200, 200, 100);
                            frm_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("删除信息失败");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_suc.add(jl_suc);
                            frm_suc.setVisible(true);
                        }
                    }
                });
            }
        });
        // 修改
        jm_1_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_change.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_change.getLayeredPane().setLayout(null);
                frm_change.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));

                frm_change.setBounds(800, 400, 500, 400);
                frm_change.setLayout(null);
                JLabel jl_1 = new JLabel("输入要修改的本科生的学号:");
                jl_1.setBounds(140, 50, 200, 50);

                JTextField jt_input_1 = new JTextField();
                jt_input_1.setBounds(140, 100, 200, 30);
                jt_input_1.setEditable(true);
                jt_input_1.setHorizontalAlignment(SwingConstants.LEFT);

                JButton jb_1 = new JButton("确定");
                jb_1.setBounds(120, 280, 70, 30);
                JButton jb_2 = new JButton("取消");
                jb_2.setBounds(280, 280, 70, 30);

                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        UnderGraduateAction uaction = new UnderGraduateAction();
                        UnderGraduate ugraduate = new UnderGraduate();
                        int input = Integer.valueOf(jt_input_1.getText());
                        try {
                            ugraduate = uaction.get(Integer.valueOf(input));
                            if (ugraduate == null) {
                                JFrame frm_add_suc = new JFrame("失败");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("学号错误");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            JFrame frm_add_suc = new JFrame("失败");
                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_add_suc.setBounds(500, 200, 200, 100);
                            frm_add_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("学号错误");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_add_suc.add(jl_suc);
                            frm_add_suc.setVisible(true);
                        }
                        String user_name = ugraduate.getUser_name();
                        int id_ = ugraduate.getId_();
                        String gender = ugraduate.getGender();
                        Date birthday = ugraduate.getBirthday();
                        String school = ugraduate.getSchool();
                        String class_ = ugraduate.getClass_();
                        String major = ugraduate.getMajor();

                        // 弹出后修改框
                        UnderGraduate finalUGraduate = ugraduate;
                        jb_1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                back_lable1.setBounds(0, 0, 500, 700);
                                mypanel1 = (JPanel) frm_update.getContentPane();
                                mypanel1.setOpaque(false);
                                mypanel1.setLayout(new FlowLayout());
                                frm_update.getLayeredPane().setLayout(null);
                                frm_update.getLayeredPane().add(back_lable1, new Integer(Integer.MIN_VALUE));

                                frm_update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_update.setBounds(400, 250, 500, 700);
                                frm_update.setLayout(null);

                                //加入新标签
                                JLabel jl_user_name, jl_id_, jl_gender, jl_birthday, jl_school, jl_class_, jl_major;
                                jl_user_name = new JLabel("姓名:");
                                jl_id_ = new JLabel("身份证号：");
                                jl_gender = new JLabel("性别：");
                                jl_birthday = new JLabel("生日：");
                                jl_school = new JLabel("学校：");
                                jl_class_ = new JLabel("班级：");
                                jl_major = new JLabel("专业：");
                                jl_user_name.setBounds(70, 1, 300, 120);
                                jl_id_.setBounds(70, 50, 300, 120);
                                jl_gender.setBounds(70, 100, 300, 120);
                                jl_birthday.setBounds(70, 150, 300, 120);
                                jl_school.setBounds(70, 200, 300, 120);
                                jl_class_.setBounds(70, 250, 300, 120);
                                jl_major.setBounds(70, 300, 300, 120);
                                frm_update.add(jl_user_name);
                                frm_update.add(jl_id_);
                                frm_update.add(jl_gender);
                                frm_update.add(jl_birthday);
                                frm_update.add(jl_school);
                                frm_update.add(jl_class_);
                                frm_update.add(jl_major);


                                //创建信息的输入框
                                JTextField jt_user_name = new JTextField();
                                jt_user_name.setEditable(true);
                                jt_user_name.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_user_name.setBounds(150, 45, 200, 25);
                                jt_user_name.addFocusListener(new JTextFieldHintListener(jt_user_name, user_name));

                                JTextField jt_id_ = new JTextField();
                                jt_id_.setEditable(true);
                                jt_id_.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_id_.setBounds(150, 95, 200, 25);
                                jt_id_.addFocusListener(new JTextFieldHintListener(jt_id_, String.valueOf(id_)));

                                JTextField jt_gender = new JTextField();
                                jt_gender.setEditable(true);
                                jt_gender.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_gender.setBounds(150, 145, 200, 25);
                                jt_gender.addFocusListener(new JTextFieldHintListener(jt_gender, gender));

                                JTextField jt_birthday = new JTextField();
                                jt_birthday.setEditable(true);
                                jt_birthday.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_birthday.setBounds(150, 195, 200, 25);
                                jt_birthday.addFocusListener(new JTextFieldHintListener(jt_birthday, String.valueOf(birthday)));

                                JTextField jt_school = new JTextField();
                                jt_school.setEditable(true);
                                jt_school.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_school.setBounds(150, 245, 200, 25);
                                jt_school.addFocusListener(new JTextFieldHintListener(jt_school, school));

                                JTextField jt_class_ = new JTextField();
                                jt_class_.setEditable(true);
                                jt_class_.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_class_.setBounds(150, 295, 200, 25);
                                jt_class_.addFocusListener(new JTextFieldHintListener(jt_class_, class_));

                                JTextField jt_major = new JTextField();
                                jt_major.setEditable(true);
                                jt_major.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_major.setBounds(150, 345, 200, 25);
                                jt_major.addFocusListener(new JTextFieldHintListener(jt_major, major));


                                //创建按钮
                                JButton jb_1 = new JButton("提交");//提交按纽
                                jb_1.setBounds(140, 500, 60, 30);
                                jb_1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        // 获取输入信息
                                        try {
                                            UnderGraduateAction uaction = new UnderGraduateAction();
                                            UnderGraduate ug1 = new UnderGraduate();
                                            finalUGraduate.setUser_name(jt_user_name.getText());
                                            finalUGraduate.setId_(Integer.valueOf(jt_id_.getText()));
                                            finalUGraduate.setGender(jt_gender.getText());
                                            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                                            Date birthday = null;
                                            try {
                                                birthday = sf.parse(jt_birthday.getText());
                                            } catch (ParseException e1) {
                                                e1.printStackTrace();
                                            }
                                            finalUGraduate.setBirthday(birthday);
                                            finalUGraduate.setSchool(jt_school.getText());
                                            finalUGraduate.setClass_(jt_class_.getText());
                                            finalUGraduate.setMajor(jt_major.getText());
                                            try {
                                                uaction.edit(finalUGraduate);
                                                JFrame frm_add_suc = new JFrame("修改成功");
                                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                frm_add_suc.setBounds(500, 200, 200, 100);
                                                frm_add_suc.setLayout(null);
                                                //设置标签
                                                JLabel jl_suc = new JLabel("修改信息成功");
                                                jl_suc.setBounds(50, 20, 120, 20);
                                                //添加入面板
                                                frm_add_suc.add(jl_suc);
                                                frm_add_suc.setVisible(true);
                                            } catch (Exception e1) {
                                                e1.printStackTrace();
                                                JFrame frm_add_suc = new JFrame("修改失败");
                                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                frm_add_suc.setBounds(500, 200, 200, 100);
                                                frm_add_suc.setLayout(null);
                                                //设置标签
                                                JLabel jl_suc = new JLabel("修改信息失败");
                                                jl_suc.setBounds(50, 20, 120, 20);
                                                //添加入面板
                                                frm_add_suc.add(jl_suc);
                                                frm_add_suc.setVisible(true);
                                            }
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                            JFrame frm_add_suc = new JFrame("修改失败");
                                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            frm_add_suc.setBounds(500, 200, 200, 100);
                                            frm_add_suc.setLayout(null);
                                            //设置标签
                                            JLabel jl_suc = new JLabel("修改信息失败");
                                            jl_suc.setBounds(50, 20, 120, 20);
                                            //添加入面板
                                            frm_add_suc.add(jl_suc);
                                            frm_add_suc.setVisible(true);
                                        }
                                    }
                                });

                                JButton jb_2 = new JButton("取消");//取消提交按钮
                                jb_2.setBounds(280, 500, 60, 30);
                                jb_2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        frm_update.dispose();
                                    }
                                });

                                //添加输入框
                                frm_update.add(jt_user_name);
                                frm_update.add(jt_id_);
                                frm_update.add(jt_gender);
                                frm_update.add(jt_birthday);
                                frm_update.add(jt_school);
                                frm_update.add(jt_class_);
                                frm_update.add(jt_major);
                                frm_update.add(jb_1);
                                frm_update.add(jb_2);

                                frm_update.setVisible(true);
                            }

                        });
                    }
                });

                jb_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm_yanstu_add.dispose();
                    }
                });

                //添加
                frm_change.add(jl_1);
                frm_change.add(jt_input_1);
                frm_change.add(jb_1);
                frm_change.add(jb_2);
                frm_change.setVisible(true);
            }
        });


        // 助教博士生信息
        jm_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        // 查询
        jm_4_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_ta.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_ta.getLayeredPane().setLayout(null);
                frm_ta.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));


                //创建新的窗口

                JPanel toppanel = new JPanel();
                frm_ta.add(toppanel, BorderLayout.NORTH);

                //设置查询标签
                JLabel jl1 = new JLabel("请输入学号");

                //创建信息输入框
                JTextField jt_yan = new JTextField();
                jt_yan.setEditable(true);
                jt_yan.setHorizontalAlignment(SwingConstants.LEFT);
                jt_yan.setColumns(30);

                //创建查询按钮
                JButton jb_search = new JButton("查询");

                //添加显示标签、输入框和搜索按钮
                toppanel.add(jl1);
                toppanel.add(jt_yan);
                toppanel.add(jb_search);

                //创建面板并放在下半部分
                JPanel bottompanel = new JPanel();
                frm_ta.add(bottompanel, BorderLayout.CENTER);

                //创建输出框
                JTextArea jta_output = new JTextArea();
                jta_output.setRows(20);
                jta_output.setColumns(30);
                jta_output.setEditable(false);
                //创建输出提醒标签
                JLabel jl_output = new JLabel();
                jl_output.setText("查询结果");


                //底部面板添加标签和输出框
                bottompanel.add(jta_output);
                bottompanel.add(jl_output);

                frm_ta.setBounds(400, 250, 500, 400);
                frm_ta.setVisible(true);

                //对查询跳转函数并输出
                jb_search.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取输入值
                        int input = Integer.valueOf(jt_yan.getText());
                        // 函数处理
                        // 查询三（单个）
                        TaAction action = new TaAction();
                        TA ta1 = null;
                        try {
                            ta1 = action.get(input);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        // 打印研究生信息
                        if (ta1 == null) {
                            jta_output.setText("查无此人！！");
                        }
                        jta_output.setText(ta1.toString());
                    }
                });
            }
        });
        // 添加
        jm_4_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable2.setBounds(0, 0, 500, 800);
                mypanel2 = (JPanel) frm_ta_add.getContentPane();
                mypanel2.setOpaque(false);
                mypanel2.setLayout(new FlowLayout());
                frm_ta_add.getLayeredPane().setLayout(null);
                frm_ta_add.getLayeredPane().add(back_lable2, new Integer(Integer.MIN_VALUE));


                frm_ta_add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm_ta_add.setBounds(400, 250, 500, 800);
                frm_ta_add.setLayout(null);

                //加入新标签
                JLabel jl_user_name, jl_id_, jl_gender, jl_birthday, jl_studentNo, jl_school, jl_class_, jl_direction, jl_advisername, jl_teacherNo, jl_schoolName, jl_department;
                jl_user_name = new JLabel("姓名:");
                jl_id_ = new JLabel("身份证号：");
                jl_gender = new JLabel("性别：");
                jl_birthday = new JLabel("生日：");
                jl_studentNo = new JLabel("学号：");
                jl_school = new JLabel("学校：");
                jl_class_ = new JLabel("班级：");
                jl_direction = new JLabel("研究方向：");
                jl_advisername = new JLabel("导师：");
                jl_teacherNo = new JLabel("教师号");
                jl_schoolName = new JLabel("学校");
                jl_department = new JLabel("部门");
                jl_user_name.setBounds(70, 1, 300, 120);
                jl_id_.setBounds(70, 50, 300, 120);
                jl_gender.setBounds(70, 100, 300, 120);
                jl_birthday.setBounds(70, 150, 300, 120);
                jl_studentNo.setBounds(70, 200, 300, 120);
                jl_school.setBounds(70, 250, 300, 120);
                jl_class_.setBounds(70, 300, 300, 120);
                jl_direction.setBounds(70, 350, 300, 120);
                jl_advisername.setBounds(70, 400, 300, 120);
                jl_teacherNo.setBounds(70, 450, 300, 120);
                jl_schoolName.setBounds(70, 500, 300, 120);
                jl_department.setBounds(70, 550, 300, 120);
                frm_ta_add.add(jl_user_name);
                frm_ta_add.add(jl_id_);
                frm_ta_add.add(jl_gender);
                frm_ta_add.add(jl_birthday);
                frm_ta_add.add(jl_studentNo);
                frm_ta_add.add(jl_school);
                frm_ta_add.add(jl_class_);
                frm_ta_add.add(jl_direction);
                frm_ta_add.add(jl_advisername);
                frm_ta_add.add(jl_teacherNo);
                frm_ta_add.add(jl_schoolName);
                frm_ta_add.add(jl_department);


                //创建信息的输入框
                JTextField jt_user_name = new JTextField();
                jt_user_name.setEditable(true);
                jt_user_name.setHorizontalAlignment(SwingConstants.LEFT);
                jt_user_name.setBounds(150, 45, 200, 25);
                jt_user_name.addFocusListener(new JTextFieldHintListener(jt_user_name, "如:小李"));

                JTextField jt_id_ = new JTextField();
                jt_id_.setEditable(true);
                jt_id_.setHorizontalAlignment(SwingConstants.LEFT);
                jt_id_.setBounds(150, 95, 200, 25);
                jt_id_.addFocusListener(new JTextFieldHintListener(jt_id_, "18位有效数字"));

                JTextField jt_gender = new JTextField();
                jt_gender.setEditable(true);
                jt_gender.setHorizontalAlignment(SwingConstants.LEFT);
                jt_gender.setBounds(150, 145, 200, 25);
                jt_gender.addFocusListener(new JTextFieldHintListener(jt_gender, "男/女"));

                JTextField jt_birthday = new JTextField();
                jt_birthday.setEditable(true);
                jt_birthday.setHorizontalAlignment(SwingConstants.LEFT);
                jt_birthday.setBounds(150, 195, 200, 25);
                jt_birthday.addFocusListener(new JTextFieldHintListener(jt_birthday, "如:2000-01-01"));

                JTextField jt_studentNo = new JTextField();
                jt_studentNo.setEditable(true);
                jt_studentNo.setHorizontalAlignment(SwingConstants.LEFT);
                jt_studentNo.setBounds(150, 245, 200, 25);
                jt_studentNo.addFocusListener(new JTextFieldHintListener(jt_studentNo, "8位有效数字"));

                JTextField jt_school = new JTextField();
                jt_school.setEditable(true);
                jt_school.setHorizontalAlignment(SwingConstants.LEFT);
                jt_school.setBounds(150, 295, 200, 25);
                jt_school.addFocusListener(new JTextFieldHintListener(jt_school, "如:太原理工大学"));

                JTextField jt_class_ = new JTextField();
                jt_class_.setEditable(true);
                jt_class_.setHorizontalAlignment(SwingConstants.LEFT);
                jt_class_.setBounds(150, 345, 200, 25);
                jt_class_.addFocusListener(new JTextFieldHintListener(jt_class_, "如:软件1840"));

                JTextField jt_direction = new JTextField();
                jt_direction.setEditable(true);
                jt_direction.setHorizontalAlignment(SwingConstants.LEFT);
                jt_direction.setBounds(150, 395, 200, 25);
                jt_direction.addFocusListener(new JTextFieldHintListener(jt_direction, "如:软件工程"));

                JTextField jt_advisername = new JTextField();
                jt_advisername.setEditable(true);
                jt_advisername.setHorizontalAlignment(SwingConstants.LEFT);
                jt_advisername.setBounds(150, 445, 200, 25);
                jt_advisername.addFocusListener(new JTextFieldHintListener(jt_advisername, "如:李老师"));

                JTextField jt_teacherNo = new JTextField();
                jt_teacherNo.setEditable(true);
                jt_teacherNo.setHorizontalAlignment(SwingConstants.LEFT);
                jt_teacherNo.setBounds(150, 495, 200, 25);
                jt_teacherNo.addFocusListener(new JTextFieldHintListener(jt_teacherNo, "8位有效数字"));

                JTextField jt_schoolName = new JTextField();
                jt_schoolName.setEditable(true);
                jt_schoolName.setHorizontalAlignment(SwingConstants.LEFT);
                jt_schoolName.setBounds(150, 545, 200, 25);
                jt_schoolName.addFocusListener(new JTextFieldHintListener(jt_schoolName, "如:太原理工大学"));

                JTextField jt_department = new JTextField();
                jt_department.setEditable(true);
                jt_department.setHorizontalAlignment(SwingConstants.LEFT);
                jt_department.setBounds(150, 595, 200, 25);
                jt_department.addFocusListener(new JTextFieldHintListener(jt_department, "如:大数据学院"));


                //创建按钮
                JButton jb_1 = new JButton("提交");//提交按纽
                jb_1.setBounds(140, 640, 60, 30);
                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取输入信息
                        try {
                            TaAction action = new TaAction();
                            TA t2 = new TA();
                            t2.setUser_name(jt_user_name.getText());
                            t2.setId_(Integer.valueOf(jt_id_.getText()));
                            t2.setGender(jt_gender.getText());
                            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                            Date birthday = null;
                            try {
                                birthday = sf.parse(jt_birthday.getText());
                            } catch (ParseException e1) {
                                e1.printStackTrace();
                            }
                            t2.setBirthday(birthday);
                            t2.setStudentNo(Integer.valueOf(jt_studentNo.getText()));
                            t2.setSchool(jt_school.getText());
                            t2.setClass_(jt_class_.getText());
                            t2.setDirection(jt_direction.getText());
                            t2.setAdviserName(jt_advisername.getText());
                            t2.setTeacherNo(Integer.valueOf(jt_teacherNo.getText()));
                            t2.setSchoolName(jt_schoolName.getText());
                            t2.setDepartment(jt_department.getText());

                            try {
                                action.add(t2);
                                JFrame frm_add_suc = new JFrame("添加成功");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("添加信息成功");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            } catch (Exception e1) {
                                e1.printStackTrace();
                                JFrame frm_add_suc = new JFrame("添加失败");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("添加信息失败");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            JFrame frm_add_suc = new JFrame("添加失败");
                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_add_suc.setBounds(500, 200, 200, 100);
                            frm_add_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("添加信息失败");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_add_suc.add(jl_suc);
                            frm_add_suc.setVisible(true);
                        }
                    }
                });

                JButton jb_2 = new JButton("取消");//取消提交按钮
                jb_2.setBounds(280, 640, 60, 30);
                jb_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm_ta_add.dispose();
                    }
                });

                //添加输入框
                frm_ta_add.add(jt_user_name);
                frm_ta_add.add(jt_id_);
                frm_ta_add.add(jt_gender);
                frm_ta_add.add(jt_birthday);
                frm_ta_add.add(jt_studentNo);
                frm_ta_add.add(jt_school);
                frm_ta_add.add(jt_class_);
                frm_ta_add.add(jt_direction);
                frm_ta_add.add(jt_advisername);
                frm_ta_add.add(jt_teacherNo);
                frm_ta_add.add(jt_schoolName);
                frm_ta_add.add(jt_department);

                frm_ta_add.add(jb_1);
                frm_ta_add.add(jb_2);

                frm_ta_add.setVisible(true);
            }

        });
        // 删除
        jm_4_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_ta_delete.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_ta_delete.getLayeredPane().setLayout(null);
                frm_ta_delete.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));


                frm_ta_delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm_ta_delete.setBounds(400, 250, 500, 400);
                frm_ta_delete.setLayout(null);

                //设置按钮
                JButton jb_1 = new JButton("确定");
                jb_1.setBounds(170, 60, 60, 30);
                JButton jb_2 = new JButton("取消");
                jb_2.setBounds(270, 60, 60, 30);

                //设置标签
                JLabel jl_delete = new JLabel("输入要删除助教博士生的学号:");
                jl_delete.setBounds(20, 10, 200, 50);

                //设置输入框
                JTextField jt_delete = new JTextField();
                jt_delete.setBounds(200, 20, 200, 30);
                jt_delete.setEditable(true);
                jt_delete.setHorizontalAlignment(SwingConstants.LEFT);

                //添加入
                frm_ta_delete.add(jl_delete);
                frm_ta_delete.add(jt_delete);
                frm_ta_delete.add(jb_1);
                frm_ta_delete.add(jb_2);


                frm_ta_delete.setVisible(true);

                //设置确认删除的监听事件
                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 获取删除信息
                        int input = Integer.valueOf(jt_delete.getText());
                        TaAction action = new TaAction();
                        try {
                            action.del(input);
                            JFrame frm_suc = new JFrame("删除成功");
                            frm_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_suc.setBounds(500, 200, 200, 100);
                            frm_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("删除信息成功");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_suc.add(jl_suc);
                            frm_suc.setVisible(true);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                            JFrame frm_suc = new JFrame("删除失败");
                            frm_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_suc.setBounds(500, 200, 200, 100);
                            frm_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("删除信息失败");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_suc.add(jl_suc);
                            frm_suc.setVisible(true);
                        }
                    }
                });
            }
        });
        // 修改
        jm_4_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                back_lable.setBounds(0, 0, 500, 400);
                mypanel = (JPanel) frm_ta_change.getContentPane();
                mypanel.setOpaque(false);
                mypanel.setLayout(new FlowLayout());
                frm_ta_change.getLayeredPane().setLayout(null);
                frm_ta_change.getLayeredPane().add(back_lable, new Integer(Integer.MIN_VALUE));


                frm_ta_change.setBounds(800, 400, 500, 400);
                frm_ta_change.setLayout(null);
                JLabel jl_1 = new JLabel("输入要修改的助教博士生的学号:");
                jl_1.setBounds(140, 50, 200, 50);

                JTextField jt_input_1 = new JTextField();
                jt_input_1.setBounds(140, 100, 200, 30);
                jt_input_1.setEditable(true);
                jt_input_1.setHorizontalAlignment(SwingConstants.LEFT);

                JButton jb_1 = new JButton("确定");
                jb_1.setBounds(120, 280, 70, 30);
                JButton jb_2 = new JButton("取消");
                jb_2.setBounds(280, 280, 70, 30);

                jb_1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        TaAction action = new TaAction();
                        TA ta4 = new TA();
                        int input = Integer.valueOf(jt_input_1.getText());
                        try {
                            ta4 = action.get(Integer.valueOf(input));
                            if (ta4 == null) {
                                JFrame frm_add_suc = new JFrame("失败");
                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_add_suc.setBounds(500, 200, 200, 100);
                                frm_add_suc.setLayout(null);
                                //设置标签
                                JLabel jl_suc = new JLabel("学号错误");
                                jl_suc.setBounds(50, 20, 120, 20);
                                //添加入面板
                                frm_add_suc.add(jl_suc);
                                frm_add_suc.setVisible(true);
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            JFrame frm_add_suc = new JFrame("失败");
                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frm_add_suc.setBounds(500, 200, 200, 100);
                            frm_add_suc.setLayout(null);
                            //设置标签
                            JLabel jl_suc = new JLabel("学号错误");
                            jl_suc.setBounds(50, 20, 120, 20);
                            //添加入面板
                            frm_add_suc.add(jl_suc);
                            frm_add_suc.setVisible(true);
                        }
                        String user_name = ta4.getUser_name();
                        int id_ = ta4.getId_();
                        String gender = ta4.getGender();
                        Date birthday = ta4.getBirthday();
                        String school = ta4.getSchool();
                        String class_ = ta4.getClass_();
                        String direction = ta4.getDirection();
                        String advisername = ta4.getAdviserName();
                        int teacherNo = ta4.getTeacherNo();
                        String schoolName = ta4.getSchoolName();
                        String department = ta4.getDepartment();

                        // 弹出后修改框
                        TA finalTa = ta4;
                        jb_1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                back_lable1.setBounds(0, 0, 500, 700);
                                mypanel1 = (JPanel) frm_ta.getContentPane();
                                mypanel1.setOpaque(false);
                                mypanel1.setLayout(new FlowLayout());
                                frm_ta.getLayeredPane().setLayout(null);
                                frm_ta.getLayeredPane().add(back_lable1, new Integer(Integer.MIN_VALUE));

                                frm_ta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frm_ta.setBounds(400, 250, 500, 700);
                                frm_ta.setLayout(null);

                                //加入新标签
                                JLabel jl_user_name, jl_id_, jl_gender, jl_birthday, jl_school, jl_class_, jl_direction, jl_advisername, jl_teacherNo, jl_schoolName, jl_department;
                                jl_user_name = new JLabel("姓名:");
                                jl_id_ = new JLabel("身份证号：");
                                jl_gender = new JLabel("性别：");
                                jl_birthday = new JLabel("生日：");
                                jl_school = new JLabel("学校：");
                                jl_class_ = new JLabel("班级：");
                                jl_direction = new JLabel("研究方向：");
                                jl_advisername = new JLabel("导师：");
                                jl_teacherNo = new JLabel("教师号");
                                jl_schoolName = new JLabel("学校");
                                jl_department = new JLabel("部门");
                                jl_user_name.setBounds(70, 1, 300, 120);
                                jl_id_.setBounds(70, 50, 300, 120);
                                jl_gender.setBounds(70, 100, 300, 120);
                                jl_birthday.setBounds(70, 150, 300, 120);
                                jl_school.setBounds(70, 200, 300, 120);
                                jl_class_.setBounds(70, 250, 300, 120);
                                jl_direction.setBounds(70, 300, 300, 120);
                                jl_advisername.setBounds(70, 350, 300, 120);
                                jl_teacherNo.setBounds(70, 400, 300, 120);
                                jl_schoolName.setBounds(70, 450, 300, 120);
                                jl_department.setBounds(70, 500, 300, 120);
                                frm_ta.add(jl_user_name);
                                frm_ta.add(jl_id_);
                                frm_ta.add(jl_gender);
                                frm_ta.add(jl_birthday);
                                frm_ta.add(jl_school);
                                frm_ta.add(jl_class_);
                                frm_ta.add(jl_direction);
                                frm_ta.add(jl_advisername);
                                frm_ta.add(jl_teacherNo);
                                frm_ta.add(jl_schoolName);
                                frm_ta.add(jl_department);

                                //创建信息的输入框
                                JTextField jt_user_name = new JTextField();
                                jt_user_name.setEditable(true);
                                jt_user_name.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_user_name.setBounds(150, 45, 200, 25);
                                jt_user_name.addFocusListener(new JTextFieldHintListener(jt_user_name, user_name));

                                JTextField jt_id_ = new JTextField();
                                jt_id_.setEditable(true);
                                jt_id_.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_id_.setBounds(150, 95, 200, 25);
                                jt_id_.addFocusListener(new JTextFieldHintListener(jt_id_, String.valueOf(id_)));

                                JTextField jt_gender = new JTextField();
                                jt_gender.setEditable(true);
                                jt_gender.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_gender.setBounds(150, 145, 200, 25);
                                jt_gender.addFocusListener(new JTextFieldHintListener(jt_gender, gender));

                                JTextField jt_birthday = new JTextField();
                                jt_birthday.setEditable(true);
                                jt_birthday.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_birthday.setBounds(150, 195, 200, 25);
                                jt_birthday.addFocusListener(new JTextFieldHintListener(jt_birthday, String.valueOf(birthday)));

                                JTextField jt_school = new JTextField();
                                jt_school.setEditable(true);
                                jt_school.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_school.setBounds(150, 245, 200, 25);
                                jt_school.addFocusListener(new JTextFieldHintListener(jt_school, school));

                                JTextField jt_class_ = new JTextField();
                                jt_class_.setEditable(true);
                                jt_class_.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_class_.setBounds(150, 295, 200, 25);
                                jt_class_.addFocusListener(new JTextFieldHintListener(jt_class_, class_));

                                JTextField jt_direction = new JTextField();
                                jt_direction.setEditable(true);
                                jt_direction.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_direction.setBounds(150, 345, 200, 25);
                                jt_direction.addFocusListener(new JTextFieldHintListener(jt_direction, direction));

                                JTextField jt_advisername = new JTextField();
                                jt_advisername.setEditable(true);
                                jt_advisername.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_advisername.setBounds(150, 395, 200, 25);
                                jt_advisername.addFocusListener(new JTextFieldHintListener(jt_advisername, advisername));

                                JTextField jt_teacherNo = new JTextField();
                                jt_teacherNo.setEditable(true);
                                jt_teacherNo.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_teacherNo.setBounds(150, 445, 200, 25);
                                jt_teacherNo.addFocusListener(new JTextFieldHintListener(jt_teacherNo, String.valueOf(teacherNo)));

                                JTextField jt_schoolName = new JTextField();
                                jt_schoolName.setEditable(true);
                                jt_schoolName.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_schoolName.setBounds(150, 495, 200, 25);
                                jt_schoolName.addFocusListener(new JTextFieldHintListener(jt_schoolName, schoolName));

                                JTextField jt_department = new JTextField();
                                jt_department.setEditable(true);
                                jt_department.setHorizontalAlignment(SwingConstants.LEFT);
                                jt_department.setBounds(150, 545, 200, 25);
                                jt_department.addFocusListener(new JTextFieldHintListener(jt_department, department));

                                //创建按钮
                                JButton jb_1 = new JButton("提交");//提交按纽
                                jb_1.setBounds(140, 600, 60, 30);
                                jb_1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        // 获取输入信息
                                        try {
                                            TaAction action1 = new TaAction();
                                            TA ta_ = new TA();
                                            finalTa.setUser_name(jt_user_name.getText());
                                            finalTa.setId_(Integer.valueOf(jt_id_.getText()));
                                            finalTa.setGender(jt_gender.getText());
                                            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                                            Date birthday = null;
                                            try {
                                                birthday = sf.parse(jt_birthday.getText());
                                            } catch (ParseException e1) {
                                                e1.printStackTrace();
                                            }
                                            finalTa.setBirthday(birthday);
                                            finalTa.setSchool(jt_school.getText());
                                            finalTa.setClass_(jt_class_.getText());
                                            finalTa.setDirection(jt_direction.getText());
                                            finalTa.setAdviserName(jt_advisername.getText());
                                            finalTa.setTeacherNo(Integer.valueOf(jt_teacherNo.getText()));
                                            finalTa.setSchoolName(jt_schoolName.getText());
                                            finalTa.setDepartment(jt_department.getText());
                                            try {
                                                action1.edit(finalTa);
                                                JFrame frm_add_suc = new JFrame("修改成功");
                                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                frm_add_suc.setBounds(500, 200, 200, 100);
                                                frm_add_suc.setLayout(null);
                                                //设置标签
                                                JLabel jl_suc = new JLabel("修改信息成功");
                                                jl_suc.setBounds(50, 20, 120, 20);
                                                //添加入面板
                                                frm_add_suc.add(jl_suc);
                                                frm_add_suc.setVisible(true);
                                            } catch (Exception e1) {
                                                e1.printStackTrace();
                                                JFrame frm_add_suc = new JFrame("修改失败");
                                                frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                frm_add_suc.setBounds(500, 200, 200, 100);
                                                frm_add_suc.setLayout(null);
                                                //设置标签
                                                JLabel jl_suc = new JLabel("修改信息失败");
                                                jl_suc.setBounds(50, 20, 120, 20);
                                                //添加入面板
                                                frm_add_suc.add(jl_suc);
                                                frm_add_suc.setVisible(true);
                                            }
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                            JFrame frm_add_suc = new JFrame("修改失败");
                                            frm_add_suc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            frm_add_suc.setBounds(500, 200, 200, 100);
                                            frm_add_suc.setLayout(null);
                                            //设置标签
                                            JLabel jl_suc = new JLabel("修改信息失败");
                                            jl_suc.setBounds(50, 20, 120, 20);
                                            //添加入面板
                                            frm_add_suc.add(jl_suc);
                                            frm_add_suc.setVisible(true);
                                        }
                                    }
                                });

                                JButton jb_2 = new JButton("取消");//取消提交按钮
                                jb_2.setBounds(280, 600, 60, 30);
                                jb_2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        frm_ta.dispose();
                                    }
                                });

                                //添加输入框
                                frm_ta.add(jt_user_name);
                                frm_ta.add(jt_id_);
                                frm_ta.add(jt_gender);
                                frm_ta.add(jt_birthday);
                                frm_ta.add(jt_school);
                                frm_ta.add(jt_class_);
                                frm_ta.add(jt_direction);
                                frm_ta.add(jt_advisername);
                                frm_ta.add(jt_teacherNo);
                                frm_ta.add(jt_schoolName);
                                frm_ta.add(jt_department);
                                frm_ta.add(jb_1);
                                frm_ta.add(jb_2);


                                frm_ta.setVisible(true);
                            }

                        });
                    }
                });

                jb_2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frm_ta_change.dispose();
                    }
                });

                //添加
                frm_ta_change.add(jl_1);
                frm_ta_change.add(jt_input_1);
                frm_ta_change.add(jb_1);
                frm_ta_change.add(jb_2);
                frm_ta_change.setVisible(true);
            }
        });

        frm.setBounds(400, 200, 500, 300);
        frm.setVisible(true);
    }
}
