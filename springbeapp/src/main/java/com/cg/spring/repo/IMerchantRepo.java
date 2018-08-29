package com.cg.spring.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.beans.Merchant;
@Repository("merchantrepo")
public interface IMerchantRepo extends JpaRepository<Merchant, Integer>{

}
