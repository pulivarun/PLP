package com.cg.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.beans.Coupon;
import com.cg.spring.beans.Dispatch;
import com.cg.spring.beans.Merchant;
import com.cg.spring.service.IProductDispatchService;

@RestController
public class ProductController {

	@Autowired
	private IProductDispatchService productdispatchservice;
	@RequestMapping("/showproducts/{productid}")
	public Optional<Merchant> showProducts(@PathVariable String productid) {
		
		return productdispatchservice.showProducts(productid);
	}

	@RequestMapping("/showdispatch/{merchantid}")
	public List<Dispatch> showDispatch(@PathVariable String merchantid) {
		System.out.println("3");
		return productdispatchservice.showDispatch(Integer.parseInt(merchantid));
		
	}
	@RequestMapping("/getcoupon/{id}")
	public Optional<Coupon> showCoupon(@PathVariable String id) {
	
		return productdispatchservice.showCoupon(id);
		
	}

	
}
