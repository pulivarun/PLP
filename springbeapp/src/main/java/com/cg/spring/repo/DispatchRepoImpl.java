package com.cg.spring.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.beans.Dispatch;
@Repository
public class DispatchRepoImpl implements IDispatchRepo{

	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public List<Dispatch> dispatch(int productid) {



			List<Dispatch> list = new ArrayList<>();
			Query q = entityManager.createQuery("from Dispatch where product_id = '"+productid+"'");
			list = q.getResultList();
			return list;
		

	}
	

}
