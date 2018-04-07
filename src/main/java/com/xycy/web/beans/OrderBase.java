package com.xycy.web.beans;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OrderBase {
	private Integer id;
	private String orderNo;
	private String title;
	private String img;
	private Timestamp newAt;
	private Timestamp updAt;
	private Integer orderType;
	private Integer buyerId;
	private Integer sellerId;
	private Integer shopId;
	private BigDecimal total;
	private BigDecimal originalTotal;
	private BigDecimal sellerTotal;
	private Integer orderStatus;
	private Integer orderStatusCancelType;
	private Timestamp orderStatusAt;
	private Integer payType;
	private Integer payStatus;
	private Timestamp payStatusAt;
	private Integer deliveryStatus;
	private Integer deliveryStatusSignType;
	private Timestamp deliveryStatusAt;
	private Integer returnStatus;
	private Integer returnStatusCompleteType;
	private Timestamp returnStatusAt;
	private Integer isCallBack;
	private Timestamp autoExpireAt;
	private Timestamp autoReceiveAt;
	private Timestamp autoRefundAt;
	private Integer commentStatus;
	private String remark;
	private String salesId;
	private Integer sendDeliveryStatus;
	private Timestamp sendDeliveryAt;
	private Integer communityId;
	private Integer isExternal;
	private Integer returnPayStatus;
	private Timestamp returnPayStatusAt;
	private Integer returnPayStatusAgreeType;
	private Integer subsidyType;
	private BigDecimal subsidy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getOriginalTotal() {
		return originalTotal;
	}

	public void setOriginalTotal(BigDecimal originalTotal) {
		this.originalTotal = originalTotal;
	}

	public BigDecimal getSellerTotal() {
		return sellerTotal;
	}

	public void setSellerTotal(BigDecimal sellerTotal) {
		this.sellerTotal = sellerTotal;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getOrderStatusCancelType() {
		return orderStatusCancelType;
	}

	public void setOrderStatusCancelType(Integer orderStatusCancelType) {
		this.orderStatusCancelType = orderStatusCancelType;
	}

	public Timestamp getOrderStatusAt() {
		return orderStatusAt;
	}

	public void setOrderStatusAt(Timestamp orderStatusAt) {
		this.orderStatusAt = orderStatusAt;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public Timestamp getPayStatusAt() {
		return payStatusAt;
	}

	public void setPayStatusAt(Timestamp payStatusAt) {
		this.payStatusAt = payStatusAt;
	}

	public Integer getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(Integer deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public Integer getDeliveryStatusSignType() {
		return deliveryStatusSignType;
	}

	public void setDeliveryStatusSignType(Integer deliveryStatusSignType) {
		this.deliveryStatusSignType = deliveryStatusSignType;
	}

	public Timestamp getDeliveryStatusAt() {
		return deliveryStatusAt;
	}

	public void setDeliveryStatusAt(Timestamp deliveryStatusAt) {
		this.deliveryStatusAt = deliveryStatusAt;
	}

	public Integer getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(Integer returnStatus) {
		this.returnStatus = returnStatus;
	}

	public Integer getReturnStatusCompleteType() {
		return returnStatusCompleteType;
	}

	public void setReturnStatusCompleteType(Integer returnStatusCompleteType) {
		this.returnStatusCompleteType = returnStatusCompleteType;
	}

	public Timestamp getReturnStatusAt() {
		return returnStatusAt;
	}

	public void setReturnStatusAt(Timestamp returnStatusAt) {
		this.returnStatusAt = returnStatusAt;
	}

	public Integer getIsCallBack() {
		return isCallBack;
	}

	public void setIsCallBack(Integer isCallBack) {
		this.isCallBack = isCallBack;
	}

	public Timestamp getAutoExpireAt() {
		return autoExpireAt;
	}

	public void setAutoExpireAt(Timestamp autoExpireAt) {
		this.autoExpireAt = autoExpireAt;
	}

	public Timestamp getAutoReceiveAt() {
		return autoReceiveAt;
	}

	public void setAutoReceiveAt(Timestamp autoReceiveAt) {
		this.autoReceiveAt = autoReceiveAt;
	}

	public Timestamp getAutoRefundAt() {
		return autoRefundAt;
	}

	public void setAutoRefundAt(Timestamp autoRefundAt) {
		this.autoRefundAt = autoRefundAt;
	}

	public Integer getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(Integer commentStatus) {
		this.commentStatus = commentStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSalesId() {
		return salesId;
	}

	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}

	public Integer getSendDeliveryStatus() {
		return sendDeliveryStatus;
	}

	public void setSendDeliveryStatus(Integer sendDeliveryStatus) {
		this.sendDeliveryStatus = sendDeliveryStatus;
	}

	public Timestamp getSendDeliveryAt() {
		return sendDeliveryAt;
	}

	public void setSendDeliveryAt(Timestamp sendDeliveryAt) {
		this.sendDeliveryAt = sendDeliveryAt;
	}

	public Integer getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	public Integer getIsExternal() {
		return isExternal;
	}

	public void setIsExternal(Integer isExternal) {
		this.isExternal = isExternal;
	}

	public Integer getReturnPayStatus() {
		return returnPayStatus;
	}

	public void setReturnPayStatus(Integer returnPayStatus) {
		this.returnPayStatus = returnPayStatus;
	}

	public Timestamp getReturnPayStatusAt() {
		return returnPayStatusAt;
	}

	public void setReturnPayStatusAt(Timestamp returnPayStatusAt) {
		this.returnPayStatusAt = returnPayStatusAt;
	}

	public Integer getReturnPayStatusAgreeType() {
		return returnPayStatusAgreeType;
	}

	public void setReturnPayStatusAgreeType(Integer returnPayStatusAgreeType) {
		this.returnPayStatusAgreeType = returnPayStatusAgreeType;
	}

	public Integer getSubsidyType() {
		return subsidyType;
	}

	public void setSubsidyType(Integer subsidyType) {
		this.subsidyType = subsidyType;
	}

	public BigDecimal getSubsidy() {
		return subsidy;
	}

	public void setSubsidy(BigDecimal subsidy) {
		this.subsidy = subsidy;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
