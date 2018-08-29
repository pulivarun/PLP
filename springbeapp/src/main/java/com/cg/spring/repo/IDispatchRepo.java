
package com.cg.spring.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.cg.spring.beans.Dispatch;
@Repository("dispatchrepo")
public interface IDispatchRepo {

	List<Dispatch> dispatch(int productid);
	

	
	/* default List<Dispatch> dispatch(int productid)
	    {
	        System.out.println("hello");
	        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	        EntityManager entitymanager = emfactory.createEntityManager();
	        Query query = entitymanager.createQuery("select nt from Dispatch nt where nt.product_Id ='"+productid+"'");
	        List<Dispatch> list = query.getResultList();
	        return list;
	    }
     */
	
	
}
