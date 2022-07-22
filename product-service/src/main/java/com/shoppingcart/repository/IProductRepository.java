package com.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.model.Product;

public interface IProductRepository extends JpaRepository<Product, Integer>{

}
