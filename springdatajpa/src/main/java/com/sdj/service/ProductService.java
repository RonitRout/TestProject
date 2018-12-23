package com.sdj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdj.entities.Product;
import com.sdj.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Transactional
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	@Transactional
	public Optional<Product> getProductByid(int productNo){
		return productRepository.findById(productNo);
	}
}
