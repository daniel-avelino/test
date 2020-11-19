package com.example.curso1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso1.config.Cep;
import com.example.curso1.repositories.CepRepository;

@Service
public class CepService {
	
	@Autowired
	private CepRepository repository;
	
	public List<Cep> findAll(){
		return repository.findAll();
	}

}
