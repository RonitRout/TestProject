package com.sdj.test;

import java.util.List;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sdj.config.RootConfig;
import com.sdj.entities.Product;
import com.sdj.service.ProductService;

public class ProductDataJPATest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(RootConfig.class);
		ProductService service=applicationContext.getBean("productService",ProductService.class);
		/*List<Product> product=service.findAll();
		System.out.println(product);*/
		Optional<Product> product=service.getProductByid(2);
		System.out.println(product);
	}

}
