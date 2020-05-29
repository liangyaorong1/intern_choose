package com.lcvc.intern_choose.model;

public class Teacher {
    private String teacherNumber;
    private String name;
    private String password;
    private Integer professioanlId;

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
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

    public Integer getProfessioanlId() {
        return professioanlId;
    }

    public void setProfessioanlId(Integer professioanlId) {
        this.professioanlId = professioanlId;
    }
}
