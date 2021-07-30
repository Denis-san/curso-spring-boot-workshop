package com.san.webServiceCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.san.webServiceCourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
