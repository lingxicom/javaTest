package com.model;

/**
 * 从 Student 类中派生出 Graduate（研究生）类，添加属性：direction（研
 * 究方向），adviserName（导师姓名）。
 */

public class Gradute extends Student {
    // 研究方向
    private String direction;
    // 导师姓名
    private String adviserName;

    // getter setter

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getAdviserName() {
        return adviserName;
    }

    public void setAdviserName(String adviserName) {
        this.adviserName = adviserName;
    }
}
