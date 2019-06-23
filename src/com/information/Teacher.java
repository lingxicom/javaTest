package com.information;

/**
 * 从 Person 类派生出 Teacher（教师）类，添
 * 加属性：teacherNo（教师编号），schoolName（学校），department（部门）。
 */

public class Teacher extends Person {
    // 教师编号
    private int teacherNo;
    // 学校
    private String schoolName;
    // 部门
    private String department;

    // getter setter

    public int getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(int teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
