
package com.cg.spring.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.spring.beans.Dispatch;
@Repository("dispatchrepo")
public interface IDispatchRepo {

	List<Dispatch> dispatch(int productid);
	

	
	
	
}
