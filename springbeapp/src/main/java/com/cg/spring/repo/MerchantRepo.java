package com.cg.spring.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.beans.Merchant;
@Repository("merchantrepo")
public class MerchantRepo {
	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	public Merchant getMerchant(String email) {
		/*List<Product>list=new ArrayList<Product>();*/
		Query q = entityManager.createQuery("from Dispatch where product_id = '"+email+"'");
		Merchant merchant = (Merchant) q.getSingleResult();
		return merchant;
	}

	public Merchant findByEmail(String merchantid) {
		// TODO Auto-generated method stub
		Query q = entityManager.createQuery("from Merchant where Merchant_email = '"+merchantid+"'");
		Merchant merchant = (Merchant) q.getSingleResult();
		return merchant;
	}

}
