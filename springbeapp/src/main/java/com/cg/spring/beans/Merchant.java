package com.cg.spring.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private String Merchant_email;
	@Column(length = 30)
	private String merchant_Name;
	@OneToMany(targetEntity = Product.class, mappedBy = "merchant", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> products = new ArrayList<Product>();

	public String getMerchant_Id() {
		return Merchant_email;
	}

	public void setMerchant_Id(String merchant_Id) {
		this.Merchant_email = merchant_Id;
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
