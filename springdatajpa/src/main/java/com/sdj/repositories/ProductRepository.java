package com.sdj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdj.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
