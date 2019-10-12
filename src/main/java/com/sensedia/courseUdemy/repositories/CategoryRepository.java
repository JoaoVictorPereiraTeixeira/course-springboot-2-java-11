package com.sensedia.courseUdemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sensedia.courseUdemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
