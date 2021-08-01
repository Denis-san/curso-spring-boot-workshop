package com.san.webServiceCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.webServiceCourse.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
