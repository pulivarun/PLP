package com.cg.spring.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.bean.Coupon;
import com.cg.spring.bean.Dispatch;
import com.cg.spring.bean.Merchant;

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
		Merchant merchant=rt.getForObject("http://localhost:9191/showproducts/"+id,Merchant.class );
		
		ModelAndView mv = new ModelAndView();
		/*if(list.size()>0)
		return new ModelAndView("display","cust",list);
		else
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("MerchantNotPresent");
			return mv;
		}*/

		if(merchant!=null)
		{
			return new ModelAndView("display","cust",merchant.getProducts());
	
			
		}
		else
		{
			
			mv.setViewName("MerchantNotPresent");
		}
		return mv;
	}

@RequestMapping("/coupon/{id}")
	public ModelAndView getCupon(@PathVariable String id) {
		RestTemplate rt = new RestTemplate();
		LocalDate today=LocalDate.now();
		Coupon p = rt.getForObject("http://localhost:9191/getcoupon/" + id, Coupon.class);
		System.out.println(p);
		ModelAndView mv = new ModelAndView();
		
		
		
		if(p!=null && (p.getDate().compareTo(today)>=0))
		{
			mv.addObject("obj", p);
			mv.setViewName("Present");
			
		}
		else
		{
			
			mv.setViewName("notpresent");
		}
		return mv;
	}
	@RequestMapping("/ShowDispatch/{id}")
	public ModelAndView showDispatch(@PathVariable String id)
	{
		
		RestTemplate rt=new RestTemplate();
		List<Dispatch> list=rt.getForObject("http://localhost:9191/showdispatch/"+id,ArrayList.class );
		
		if(list.size()>0)
			return new ModelAndView("dispatch","cust",list);
			else
			{
				ModelAndView mv = new ModelAndView();
				mv.setViewName("ProductNotPresent");
				return mv;
			}
	}

}
