package io.javabrains.productserviceapp.service;

import io.javabrains.productserviceapp.model.Product;
import io.javabrains.productserviceapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public void delete(Product product) {
        productRepository.delete(product);
    }
    public abstract Product getProductById(Integer productId);
}
