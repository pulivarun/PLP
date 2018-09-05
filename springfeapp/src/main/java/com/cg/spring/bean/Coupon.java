package com.cg.spring.bean;

import java.time.LocalDate;




public class Coupon {

	
	private String cid;
   
	private String email;
	
	private LocalDate date;
	
	public Coupon() {
		
	}
	@Override
	public String toString() {
		return email.toString();
	}


	

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
