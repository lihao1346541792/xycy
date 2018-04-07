package com.xycy.web.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MallProduct implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer brandId;
	private Integer supplierId;
	private Integer categoryId;
	private Integer shopId;
	private String unit;
	private Integer stock;
	private Integer saleCount;
	private BigDecimal price;
	private BigDecimal marketPrice;
	private String img;
	private String resume;
	private String resumeImg;
	private String feature;
	private Integer pv;
	private Integer isRecommend;
	private Integer recommendOidx;
	private Integer status;
	private Timestamp statusAt;
	private Timestamp newAt;
	private Timestamp updAt;
	private Integer feedbackCount;
	private String subtitle;
	private String brandName;
	private Integer isAllNew;
	private Integer concernCount;
	private Integer discoverRecommend;

	public MallProduct() {
		super();
	}

	public MallProduct(Integer id) {
		super();
		this.id = id;
	}

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

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getResumeImg() {
		return resumeImg;
	}

	public void setResumeImg(String resumeImg) {
		this.resumeImg = resumeImg;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public Integer getPv() {
		return pv;
	}

	public void setPv(Integer pv) {
		this.pv = pv;
	}

	public Integer getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getRecommendOidx() {
		return recommendOidx;
	}

	public void setRecommendOidx(Integer recommendOidx) {
		this.recommendOidx = recommendOidx;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getStatusAt() {
		return statusAt;
	}

	public void setStatusAt(Timestamp statusAt) {
		this.statusAt = statusAt;
	}

	public Timestamp getNewAt() {
		return newAt;
	}

	public void setNewAt(Timestamp newAt) {
		this.newAt = newAt;
	}

	public Timestamp getUpdAt() {
		return updAt;
	}

	public void setUpdAt(Timestamp updAt) {
		this.updAt = updAt;
	}

	public Integer getFeedbackCount() {
		return feedbackCount;
	}

	public void setFeedbackCount(Integer feedbackCount) {
		this.feedbackCount = feedbackCount;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getIsAllNew() {
		return isAllNew;
	}

	public void setIsAllNew(Integer isAllNew) {
		this.isAllNew = isAllNew;
	}

	public Integer getConcernCount() {
		return concernCount;
	}

	public void setConcernCount(Integer concernCount) {
		this.concernCount = concernCount;
	}

	public Integer getDiscoverRecommend() {
		return discoverRecommend;
	}

	public void setDiscoverRecommend(Integer discoverRecommend) {
		this.discoverRecommend = discoverRecommend;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
