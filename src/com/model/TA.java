package com.model;

/**
 * 从 Graduate 类和 Teacher 类派生出 TＡ（助教博士生）类
 */

public class TA extends Graduate {
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

    @Override
    public String toString() {
        return "TA{" +
                "user_name=" + getUser_name() +
                "id_=" + getId_() + '\'' +
                "gender=" + getGender() + '\'' +
                "birthday=" + getBirthday() + '\'' +
                "studentNo=" + getStudentNo() + '\'' +
                "school='" + getSchool() + '\'' +
                "class_='" + getClass_() + '\'' +
                "direction'" + getDirection() + '\'' +
                "adviserName'" + getAdviserName() + '\'' +
                "teacherNo=" + teacherNo + '\'' +
                "schoolName='" + schoolName + '\'' +
                "department='" + department + '\'' +
                '}';
    }
}
