package com.example.curso1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso1.config.Cep;
import com.example.curso1.services.CepService;

@RestController
@RequestMapping(path="/cep")
public class CepController {
	
	@Autowired
	private CepService service;
	
	@GetMapping
	public ResponseEntity<List<Cep>> findAll(){
		List<Cep> list = new ArrayList<>();
		list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
