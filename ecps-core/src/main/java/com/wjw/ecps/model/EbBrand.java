package com.wjw.ecps.model;

public class EbBrand {
    private Long brandId;

    private String brandName;

    private String brandDesc;

    private String imgs;

    private String website;

    private Integer brandSort;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }

	@Override
	public String toString() {
		return "EbBrand [brandId=" + brandId + ", brandName=" + brandName + ", brandDesc=" + brandDesc + ", imgs="
				+ imgs + ", website=" + website + ", brandSort=" + brandSort + "]";
	}
    
}