package com.information;

/**
 * 设计一个 Person（人员）类，考虑到通用性，只抽象出所有类型人员都
 * 具有的属性：name（姓名）, id（身份证号），gender（性别），birthday（出生日
 * 期）等等。其中“出生日期”为内嵌子对象，是一个 Date（日期）类型，Date 类
 * 具有属性: year(年)，month（月），day（日）。用成员函数实现对人员信息的录入
 * 和显示等必要功能操作。
 */
public abstract class Person {
    // 姓名
    private String name;
    // 身份证号
    private int id;
    // 性别
    private char gender;
    // 出生日期
    private Date birthday;

    // Date类
    public class Date {
        private int year;
        private int month;
        private int day;
    }


    // 修改信息
    // getter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    // 无参构造方法
    public Person() {
        super();
    }

    // 有参构造方法
    public Person(String name, int id, char gender, Date birthday) {
        super();
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
    }
}

