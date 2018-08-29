package com.cg.spring.bean;

import java.util.ArrayList;
import java.util.List;



public class Merchant {


	private int merchant_Id;
	
	private String merchant_Name;
	private List<Product> products = new ArrayList<Product>();

	public int getMerchant_Id() {
		return merchant_Id;
	}

	public void setMerchant_Id(int merchant_Id) {
		this.merchant_Id = merchant_Id;
	}

	public String getMerchant_Name() {
		return merchant_Name;
	}

	public void setMerchant_Name(String merchant_Name) {
		this.merchant_Name = merchant_Name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product) {

		product.setMerchant(this); // this will avoid nested cascade
		this.getProducts().add(product);
	}
}
