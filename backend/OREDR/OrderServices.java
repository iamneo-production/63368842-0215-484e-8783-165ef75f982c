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

    public Order addOrder(Order order){
        return repository.save(order);
    }

    public List<Order> showOrder(){
        return repository.findAll();
    }

    public void deleteOrder(int id){
        repository.deleteById(id);
    }

    public Order updateOrder(Order order){
        Order existingOrder = repository.findById(order.getId()).orElse(null);
        existingOrder.setOrderName(order.getOrderName());
        existingOrder.setOrderDescription(order.getOrderDescription());
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
}
