package com.example.curso1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso1.entities.Order;
import com.example.curso1.services.OrderServices;

@RestController
@RequestMapping(value="/order")
public class OrderController {
	
	@Autowired
	private OrderServices service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = new ArrayList<>();
		list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
