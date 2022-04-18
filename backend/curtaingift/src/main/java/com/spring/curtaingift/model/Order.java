package com.spring.curtaingift.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order_details")
public class Order {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String OrderName;
    private String OrderDesc;
    private String GiftName;
    private String ThemeName;
    private Date OrderDate;
    private int OrderPrice;
    private String OrderAddress;
    private String OrderPhone;
    private String OrderEmail;
    private String Username;


    public Order(){

    }

    public Order(int id,String orderName,String themeName, String Username, String giftName, String orderDesc,Date orderDate, int orderPrice, String orderAddress, String orderPhone,String orderEmail ){
        super();
        this.id = id;
        GiftName = giftName;
        ThemeName = themeName;
        OrderName = orderName;
        OrderDesc = orderDesc;
        OrderDate = orderDate;
        OrderPrice = orderPrice;
        OrderAddress = orderAddress;
        OrderPhone = orderPhone;
        OrderEmail = orderEmail;
        this.Username = Username;
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

    public String getOrderDesc() {
        return this.OrderDesc;
    }

    public void setOrderDesc(String OrderDesc) {
        this.OrderDesc= OrderDesc;
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

    public String getGiftName() {
        return this.GiftName;
    }

    public void setGiftName(String GiftName) {
        this.GiftName = GiftName;
    }

    public String getThemeName() {
        return this.ThemeName;
    }

    public void setThemeName(String ThemeName) {
        this.ThemeName = ThemeName;
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

}
