package com.jeunesse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeunesse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
