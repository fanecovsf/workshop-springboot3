package com.jeunesse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeunesse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
