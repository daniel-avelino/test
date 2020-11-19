package com.example.curso1.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.curso1.entities.Users;
import com.example.curso1.repositories.UserRepository;


@Configuration
@Profile("test")
public class Test implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {

		Users user = new Users(null,"Daniel","daniel@gmail.com");
		repository.save(user);
	}

}
