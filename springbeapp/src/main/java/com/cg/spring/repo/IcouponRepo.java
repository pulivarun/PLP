package com.cg.spring.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spring.beans.Coupon;

public interface IcouponRepo extends JpaRepository<Coupon, String> {

}
