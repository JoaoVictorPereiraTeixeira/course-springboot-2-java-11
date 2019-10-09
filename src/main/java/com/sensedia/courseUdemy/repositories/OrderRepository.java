package com.sensedia.courseUdemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sensedia.courseUdemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
