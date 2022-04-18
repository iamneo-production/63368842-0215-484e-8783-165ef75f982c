package com.spring.curtaingift.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.spring.curtaingift.model.Order;
import com.spring.curtaingift.services.OrderServices;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrderController {
    @Autowired
    private OrderServices service;

    @GetMapping("admin/viewAllOrder")
    public List<Order> findOrder(){
        return service.showOrder();
    }

    @PutMapping("/admin/updateOrder")
    public Order updateOrder(@RequestBody Order order){
        return service.updateOrder(order);
    }
    
    @DeleteMapping("/admin/deleteOrder")
    public void deleteOrder(@RequestParam int id){
        service.deleteOrder(id);
    }

    @GetMapping("/admin/getOrder")
    public Optional<Order> getOrderByID(@RequestParam int id){
        return service.getOrderId(id);
    }

    @PostMapping("/user/addOrder")
    public Order addOrder(@RequestBody Order order){
        return service.addOrder(order);
    }

    @PutMapping("/user/editOrder")
    public Order editOrder(@RequestBody Order order){
        return service.updateOrder(order);
    }

    @DeleteMapping("/admin/cancelOrder")
    public void cancelOrder(@RequestParam int id){
        service.deleteOrder(id);
    }
}
