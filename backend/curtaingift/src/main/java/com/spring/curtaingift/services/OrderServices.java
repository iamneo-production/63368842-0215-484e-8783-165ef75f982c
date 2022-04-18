package com.spring.curtaingift.services;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.curtaingift.model.Order;
import com.spring.curtaingift.repository.OrderRepository;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository repository;
    public List<Order> saveCart(List<Order> order) {
		return repository.saveAll(order);
	}
    public List<Order> showCart() {
		return repository.findAll();
	}
    public List<Order> showuserOrder(String username) {
		return repository.finduserOrder(username);
	}

    public Order updateOrder(Order order){
        Order existingOrder = repository.findById(order.getId()).orElse(null);
        existingOrder.setOrderName(order.getOrderName());
        existingOrder.setOrderDesc(order.getOrderDesc());
        existingOrder.setOrderDate(order.getOrderDate());
        existingOrder.setOrderPrice(order.getOrderPrice());
        existingOrder.setOrderAddress(order.getOrderAddress());
        existingOrder.setOrderPhone(order.getOrderPhone());
        existingOrder.setOrderEmail(order.getOrderEmail());
        return repository.save(existingOrder);
    }

    public Optional<Order> getOrderId(int id){
        return repository.findById(id);
    }
    public List<Order> showOrder() {
        return null;
    }
    public void deleteOrder(int id) {
    }
    public Order addOrder(Order order) {
        return null;
    }
}
