package com.information;

/**
 *  从 Student 类中派生出 UnderGraduate（本科生）类，添加属性：major
 * （专业）
 */
public class UnderGraduate extends Student{
    // 专业
    private String major;

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

    @Override
    public int getStudentNo() {
        return super.getStudentNo();
    }

    @Override
    public void setStudentNo(int studentNo) {
        super.setStudentNo(studentNo);
    }

    @Override
    public String getSchool() {
        return super.getSchool();
    }

    @Override
    public void setSchool(String school) {
        super.setSchool(school);
    }

    @Override
    public String getClass_() {
        return super.getClass_();
    }

    @Override
    public void setClass_(String class_) {
        super.setClass_(class_);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
