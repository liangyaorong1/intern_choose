package com.lcvc.intern_choose.model;

import org.hibernate.validator.constraints.Length;

public class Classes {
    private Integer id;
    @Length(min = 2, max = 20, message = "名称长度必须在 {min} - {max} 之间")
    private String name;
    private Integer majorId;
    private Integer gradeId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }
}
