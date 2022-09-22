package io.javabrains.productserviceapp.model;

//import lombok.AllArgsConstructor;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "productdatabase")
//@NoArgsConstructor
//@AllArgsConstructor
public class Product {

    @Id
    private int productId;
    private String productType;
    private String productName;
    private String category;
    private double price;
    private String description;

    public Product() {
    }
    public Product(int productId, String productType, String productName, String category, double price, String description) {
        this.productId = productId;
        this.productType = productType;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.description = description;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
