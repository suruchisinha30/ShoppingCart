package io.javabrains.productserviceapp.repository;

import io.javabrains.productserviceapp.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
