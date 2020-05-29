package com.lcvc.intern_choose.model;

import java.sql.Time;

public class professionalGrade {
    //专业群年级关系表
    private Integer Id;//id
    private Integer professioanlId;//专业群ID外键
    private Integer gradeId;//年级表ID外键
    private boolean open;//是否开放选择实习老师的权限
    private Time startTime;//开放选择权限的开始时间
    private Time endTime;//开放选择权限的结束时间

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getProfessioanlId() {
        return professioanlId;
    }

    public void setProfessioanlId(Integer professioanlId) {
        this.professioanlId = professioanlId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
