package com.example.curso1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso1.entities.Products;
import com.example.curso1.repositories.ProductRepository;

@Service
public class ProductsService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Products> findAll(){
		return repository.findAll();
	}

}
