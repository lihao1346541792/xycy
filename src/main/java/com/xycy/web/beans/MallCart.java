package com.xycy.web.beans;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MallCart implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer creatorId;
	private Integer productId;
	private Integer quantity;
	private Timestamp newAt;
	private Timestamp updAt;
	private Integer productSpecId;
	private Integer status;
	private Integer stock;
	private MallProduct mallProduct;

	public MallCart() {
		super();
	}

	public MallCart(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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

	public Integer getProductSpecId() {
		return productSpecId;
	}

	public void setProductSpecId(Integer productSpecId) {
		this.productSpecId = productSpecId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public MallProduct getMallProduct() {
		return mallProduct;
	}

	public void setMallProduct(MallProduct mallProduct) {
		this.mallProduct = mallProduct;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
