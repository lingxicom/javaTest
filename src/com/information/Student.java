package com.information;

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

    // setter getter
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }

    @Override
    public Person.Date getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(Date birthday) {
        super.setBirthday(birthday);
    }

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
