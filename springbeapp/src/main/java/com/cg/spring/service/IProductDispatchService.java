package com.cg.spring.service;

import java.util.List;

import com.cg.spring.beans.Dispatch;
import com.cg.spring.beans.Product;


public interface IProductDispatchService {

	List<Product> showProducts(int merchantid);

	

	List<Dispatch> showDispatch(int productid);
	

}
