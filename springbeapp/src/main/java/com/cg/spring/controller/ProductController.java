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
	@RequestMapping("/showproducts/{productid}")
	public List<Product> showProducts(@PathVariable String productid) {
		
		return productdispatchservice.showProducts(Integer.parseInt(productid));
	}

	@RequestMapping("/showdispatch/{merchantid}")
	public List<Dispatch> showDispatch(@PathVariable String merchantid) {
	
		return productdispatchservice.showDispatch(Integer.parseInt(merchantid));
		
	}

	
}
