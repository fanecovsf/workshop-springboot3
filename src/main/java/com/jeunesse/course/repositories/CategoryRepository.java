package com.jeunesse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeunesse.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
