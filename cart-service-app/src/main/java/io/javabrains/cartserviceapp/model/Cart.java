package io.javabrains.cartserviceapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cartdatabase")
public class Cart {
    @Id
    private int cartId;
    private String productName;
    private double totalPrice;
    private int quantity;

    public Cart(int cartId, String productName, double totalPrice, int quantity) {
        this.cartId = cartId;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public Cart() {
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
