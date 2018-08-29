package com.cg.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	@RequestMapping("/")
	public String sayHello() {
		return "index";
	}
	
	@RequestMapping("/Merchant")
	public String sayMerchant() {
		return "Merchant";
	}
	
	@RequestMapping("/Product")
	public String sayProduct() {
		return "Product";
	}
	/*@REQUESTMAPPING("/INDEX")
	PUBLIC STRING SAYINDEX() {
		RETURN "INDEX";
	}*/

}
