package com.spring.curtaingift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.curtaingift.model.Order;

public interface OrderRepository extends JpaRepository <Order, Integer>{
    
}