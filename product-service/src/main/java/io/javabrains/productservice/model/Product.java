package io.javabrains.productservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Product_Search")
public class Product {
    private @Id
    Integer product_id;
    private String product_name;
    private int product_quantity;
    private int product_price;
    private String product_description;
    private String product_type;

    public Product(){

    }

    public Product(Integer product_id, String product_name, int product_quantity, int product_price, String product_description, String product_type) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_quantity = product_quantity;
        this.product_price = product_price;
        this.product_description = product_description;
        this.product_type = product_type;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_quantity=" + product_quantity +
                ", product_price=" + product_price +
                ", product_description='" + product_description + '\'' +
                ", product_type='" + product_type + '\'' +
                '}';
    }
}