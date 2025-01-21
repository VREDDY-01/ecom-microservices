package com.mic.order.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mic.order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
