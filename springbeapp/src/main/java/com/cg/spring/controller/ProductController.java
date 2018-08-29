package com.cg.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.beans.Dispatch;
import com.cg.spring.beans.Product;
import com.cg.spring.service.IProductDispatchService;

@RestController
public class ProductController {

	@Autowired
	private IProductDispatchService productdispatchservice;
	@RequestMapping("/showproducts/{merchantid}")
	public List<Product> showProducts(@PathVariable String merchantid) {
		
		return productdispatchservice.showProducts(Integer.parseInt(merchantid));
	}

	@RequestMapping("/showdispatch/{productid}")
	public List<Dispatch> showDispatch(@PathVariable String productid) {
	
		return productdispatchservice.showDispatch(Integer.parseInt(productid));
		
	}

	
}
