package com.san.webServiceCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.webServiceCourse.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
