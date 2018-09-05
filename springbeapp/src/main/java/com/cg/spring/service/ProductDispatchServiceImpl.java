package com.cg.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.beans.Coupon;
import com.cg.spring.beans.Dispatch;
import com.cg.spring.beans.Merchant;
import com.cg.spring.repo.IDispatchRepo;
import com.cg.spring.repo.IMerchantRepo;
import com.cg.spring.repo.IcouponRepo;
@Service("productdispatchservice")
public class ProductDispatchServiceImpl implements IProductDispatchService {
	@Autowired
	private IMerchantRepo merchantRepo;
	@Autowired
	private IDispatchRepo dispatchRepo;
	@Autowired
	private IcouponRepo couponRepo;
	@Override
	public Optional<Merchant> showProducts(String merchantid) {
	/*	Merchant merchant = new Merchant();*/
		/*System.out.println("1");
	//Merchant merchant =merchantRepo.findById(merchantid).get();
	//System.out.println(merchant);
		merchant=merchantRepo.getMerchant(merchantid);
		if(merchantRepo.findById(merchantid)!=null)
		{
			System.out.println("varun");
			 merchant =merchantRepo.findById(merchantid).get();
			System.out.println("puli");
		return merchant.getProducts();
	}
		else
		{
			List<Product> list=new ArrayList<Product>();
			return list;
		}*/
		return merchantRepo.findById(merchantid);
		/*if(merchant!=null)
		return merchant.getProducts();
		else
		{
			List<Product> list=new ArrayList<Product>();
			return list;
		}*/
			
	}
	@Override
	public List<Dispatch> showDispatch(int productid) {
		System.out.println("2");
		return dispatchRepo.dispatch(productid);
	}
	@Override
	public Optional<Coupon> showCoupon(String merchantid) {
		// TODO Auto-generated method stub
		return couponRepo.findById(merchantid);
	}
}
