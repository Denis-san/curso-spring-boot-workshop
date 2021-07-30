package com.san.webServiceCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.webServiceCourse.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
