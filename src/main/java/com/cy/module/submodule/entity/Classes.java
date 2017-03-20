package com.cy.module.submodule.entity;

public class Classes {
    private String claId;

    private String claName;

    private Integer claTotalNum;

    public String getClaId() {
        return claId;
    }

    public void setClaId(String claId) {
        this.claId = claId == null ? null : claId.trim();
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName == null ? null : claName.trim();
    }

    public Integer getClaTotalNum() {
        return claTotalNum;
    }

    public void setClaTotalNum(Integer claTotalNum) {
        this.claTotalNum = claTotalNum;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "claId='" + claId + '\'' +
                ", claName='" + claName + '\'' +
                ", claTotalNum=" + claTotalNum +
                '}';
    }
}