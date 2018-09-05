package com.cg.spring.bean;

import java.time.LocalDateTime;


public class Dispatch {


	private int dispatch_id;

	private LocalDateTime dispatch_time;
	private String merchant_id;
	private int product_id;
	
	private String product_name;
	
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
