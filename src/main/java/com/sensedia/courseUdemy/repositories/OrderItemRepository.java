package com.sensedia.courseUdemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sensedia.courseUdemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
