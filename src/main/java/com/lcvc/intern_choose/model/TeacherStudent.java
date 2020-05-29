package com.lcvc.intern_choose.model;

public class TeacherStudent {
    //学生和专业群年级开放权限的教师关系表
    private Integer id;
    private String studentNumber;//学号
    private Integer tpgId;//专业群年级开放权限的教师关系表的ID            TeacherProfessioanlGrade简写tpg

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getTpgId() {
        return tpgId;
    }

    public void setTpgId(Integer tpgId) {
        this.tpgId = tpgId;
    }
}
