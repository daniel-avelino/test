package com.example.curso1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso1.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
