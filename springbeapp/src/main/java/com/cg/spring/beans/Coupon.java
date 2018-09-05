package com.cg.spring.beans;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Coupon")
public class Coupon {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="coupon_id",length=40)
	private String cid;
    @Column(name="String_email",length=40)
	private String email;
	@Column(name="validity")
	private LocalDate date;
	@Column(name="price")
	private BigDecimal price;
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
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
