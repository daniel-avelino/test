package com.example.curso1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
