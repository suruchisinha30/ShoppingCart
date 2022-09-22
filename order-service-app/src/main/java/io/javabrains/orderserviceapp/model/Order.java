package io.javabrains.orderserviceapp.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "orderdatabase")
public class Order {

    private int orderId;
    private double totalPrice;
    private String modeOfPayment;
    private String orderStatus;
    private int quantity;

    public Order(int orderId, LocalDate localDate, double totalPrice, String modeOfPayment, String orderStatus, int quantity) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.modeOfPayment = modeOfPayment;
        this.orderStatus = orderStatus;
        this.quantity = quantity;
    }
    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
