package com.cg.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.spring.beans.Dispatch;
import com.cg.spring.beans.Merchant;
import com.cg.spring.beans.Product;
import com.cg.spring.repo.IDispatchRepo;
import com.cg.spring.repo.IMerchantRepo;
@Service("productdispatchservice")
public class ProductDispatchServiceImpl implements IProductDispatchService {
	@Autowired
	private IMerchantRepo merchantRepo;
	@Autowired
	private IDispatchRepo dispatchRepo;
	@Override
	public List<Product> showProducts(int merchantid) {
		Merchant merchant = new Merchant();
		merchant =merchantRepo.findById(merchantid).get();
		return merchant.getProducts();
	}
	@Override
	public List<Dispatch> showDispatch(int productid) {

		return dispatchRepo.dispatch(productid);
	}
}
