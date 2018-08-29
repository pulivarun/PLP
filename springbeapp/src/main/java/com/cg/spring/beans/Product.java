package com.cg.spring.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int product_Id;
	@Column(length=30)
	private String product_Name;

	private BigDecimal product_Price;
	@Column(length=30)
	private String product_Description;
	@ManyToOne
	@JoinColumn(name="Merchant_id")
	private Merchant merchant;
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public BigDecimal getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(BigDecimal product_Price) {
		this.product_Price = product_Price;
	}
	public String getProduct_Description() {
		return product_Description;
	}
	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}

	/*
	 * public Merchant getMerchant() { return merchant; }
	 */
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	
	
}
