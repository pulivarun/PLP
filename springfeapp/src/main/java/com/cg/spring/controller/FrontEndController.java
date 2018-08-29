package com.cg.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.bean.Dispatch;
import com.cg.spring.bean.Product;

@RestController
public class FrontEndController {
	
	/*public List<Customer> show()
	{
		
		RestTemplate rt=new RestTemplate();
		List<Customer> list=rt.getForObject("http://localhost:8082/show",ArrayList.class );
		return list;
	}*/
	@RequestMapping("/ShowProducts/{id}")
	public ModelAndView showProducts(@PathVariable String id)
	{
		
		RestTemplate rt=new RestTemplate();
		List<Product> list=rt.getForObject("http://localhost:9191/showproducts/"+id,ArrayList.class );
		return new ModelAndView("display","cust",list);
	}
	@RequestMapping("/ShowDispatch/{id}")
	public ModelAndView showDispatch(@PathVariable String id)
	{
		
		RestTemplate rt=new RestTemplate();
		List<Dispatch> list=rt.getForObject("http://localhost:9191/showdispatch/"+id,ArrayList.class );
		return new ModelAndView("dispatch","cust",list);
	}

}
