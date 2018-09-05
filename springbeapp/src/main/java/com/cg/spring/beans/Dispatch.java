package com.cg.spring.beans;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dispatch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int dispatch_id;

	private LocalDateTime dispatch_time;
	private String merchant_id;
	private int product_id;
	@Column(length = 30)
	private String product_name;
	@Column(length = 6)
	private String location;

	public int getDispatch_id() {
		return dispatch_id;
	}

	public void setDispatch_id(int dispatch_id) {
		this.dispatch_id = dispatch_id;
	}

	public LocalDateTime getDispatch_time() {
		return dispatch_time;
	}

	public void setDispatch_time(LocalDateTime dispatch_time) {
		this.dispatch_time = dispatch_time;
	}

	public String getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
