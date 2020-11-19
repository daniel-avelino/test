package com.example.curso1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso1.entities.Users;
import com.example.curso1.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserController {

	@Autowired
	private UserServices services;
	
	@GetMapping
	public ResponseEntity<List<Users>> findAll(){
		List<Users> list = services.findAll();
		return ResponseEntity.ok().body(list);
	}
}
