package com.model;

/**
 * 从 Person 类派生出 Student（学生）类，添加属性： studentNo（学号），
 * schoolName（学校），classIn (班级)
 */
public class Student extends Person {
    // 学号
    private int studentNo;
    // 学校
    private String school;
    // 班级
    private String class_;

    // getter setter

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

}



