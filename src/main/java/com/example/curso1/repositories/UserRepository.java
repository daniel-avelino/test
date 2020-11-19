package com.example.curso1.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso1.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
