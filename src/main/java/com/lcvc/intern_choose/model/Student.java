package com.lcvc.intern_choose.model;

public class Student {
    private String studentNumber;//学生主键
    private String name;//学生名字
    private String password;//密码
    private Integer classId;//年级ID，可以通过年级ID查询到所在的专业群

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
