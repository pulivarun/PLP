package com.cg.spring.bean;

import java.math.BigDecimal;


public class Product {
	

	private int product_Id;

	private String product_Name;

	private BigDecimal product_Price;
	
	private String product_Description;
	
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
