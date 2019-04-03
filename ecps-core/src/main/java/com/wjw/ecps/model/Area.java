package com.wjw.ecps.model;

public class Area {
    private Long areaId;

    private String areaName;

    private String parentId;

    private Short areaStatus;

    private Short areaCode;

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Short getAreaStatus() {
        return areaStatus;
    }

    public void setAreaStatus(Short areaStatus) {
        this.areaStatus = areaStatus;
    }

    public Short getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Short areaCode) {
        this.areaCode = areaCode;
    }
}