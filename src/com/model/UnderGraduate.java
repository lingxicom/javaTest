package com.model;

/**
 * 从 Student 类中派生出 UnderGraduate（本科生）类，添加属性：major
 * （专业）
 */

public class UnderGraduate extends Student {
    // 专业
    private String major;

    // setter getter

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return  "姓名：" + getUser_name() + '\n' +
                "身份证号：" + getId_() + '\n' +
                "性别：" + getGender() + '\n' +
                "生日：" + getBirthday() + '\n' +
                "学号：" + getStudentNo() + '\n' +
                "学校：" + getSchool() + '\n' +
                "班级：" + getClass_() + '\n' +
                "专业：" + major;
    }
}
