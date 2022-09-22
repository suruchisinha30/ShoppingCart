package io.javabrains.productserviceapp.service;

import io.javabrains.productserviceapp.model.Product;
import io.javabrains.productserviceapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductById(Integer productId) {
        return productRepository.findById(productId).get();
    }
}
