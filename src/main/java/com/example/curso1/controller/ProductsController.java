package com.example.curso1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso1.entities.Products;
import com.example.curso1.services.ProductsService;

@RestController
@RequestMapping(value="/products")
public class ProductsController {

	@Autowired
	private ProductsService service;
	
	@GetMapping
	public ResponseEntity<List<Products>> findAll(){
		List<Products> products = new ArrayList<>();
		products = service.findAll();
		return ResponseEntity.ok().body(products);
	}
	
}
