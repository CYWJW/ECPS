package com.wjw.ecps.model.query;

public class EbItemQuery {
	private Long brandId;
	
	private Short auditStatus;
	
	private Short showStatus;
	
	private String itemName;
	
	private Integer startNum;
	
	private Integer pageNo;
	
	private Integer endNum;

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Short getAuditStatus() {
		return auditStatus;
	}
	

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setAuditStatus(Short auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Short getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(Short showStatus) {
		this.showStatus = showStatus;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getStartNum() {
		return startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public Integer getEndNum() {
		return endNum;
	}

	public void setEndNum(Integer endNum) {
		this.endNum = endNum;
	}

}
