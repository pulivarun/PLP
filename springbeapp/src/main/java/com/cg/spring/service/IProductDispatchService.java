package com.cg.spring.service;

import java.util.List;
import java.util.Optional;

import com.cg.spring.beans.Coupon;
import com.cg.spring.beans.Dispatch;
import com.cg.spring.beans.Merchant;


public interface IProductDispatchService {

	Optional<Merchant> showProducts(String merchantid);

	

	List<Dispatch> showDispatch(int productid);






	Optional<Coupon> showCoupon(String merchantid);
	

}
