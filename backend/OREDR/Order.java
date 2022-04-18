package com.spring.curtaingift.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")

public class Order {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String OrderName;
    private String OrderDescription;
    private Date OrderDate;
    private int OrderPrice;
    private String OrderAddress;

    private String OrderPhone;
    private String OrderEmail;

    public Order(){

    }

    public Order(int id,String orderName,String orderDescription,Date orderDate, int orderPrice, String orderAddress, String orderPhone,String orderEmail ){
        super();
        this.id = id;
        OrderName = orderName;
        OrderDescription = orderDescription;
        OrderDate = orderDate;
        OrderPrice = orderPrice;
        OrderAddress = orderAddress;
        OrderPhone = orderPhone;
        OrderEmail = orderEmail;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderName() {
        return this.OrderName;
    }

    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    public String getOrderDescription() {
        return this.OrderDescription;
    }

    public void setOrderDescription(String OrderDescription) {
        this.OrderDescription = OrderDescription;
    }

    public Date getOrderDate() {
        return this.OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public int getOrderPrice() {
        return this.OrderPrice;
    }

    public void setOrderPrice(int OrderPrice) {
        this.OrderPrice = OrderPrice;
    }

    public String getOrderAddress() {
        return this.OrderAddress;
    }

    public void setOrderAddress(String OrderAddress) {
        this.OrderAddress = OrderAddress;
    }

    public String getOrderPhone() {
        return this.OrderPhone;
    }

    public void setOrderPhone(String OrderPhone) {
        this.OrderPhone = OrderPhone;
    }

    public String getOrderEmail() {
        return this.OrderEmail;
    }

    public void setOrderEmail(String OrderEmail) {
        this.OrderEmail = OrderEmail;
    }



}
