package com.example.curso1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso1.entities.Users;
import com.example.curso1.repositories.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll(){
		return repository.findAll();
	}
}
