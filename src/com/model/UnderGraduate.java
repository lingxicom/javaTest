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
}
