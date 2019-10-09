package com.sensedia.courseUdemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sensedia.courseUdemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
