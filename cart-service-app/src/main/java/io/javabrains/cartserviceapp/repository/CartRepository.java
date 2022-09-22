package io.javabrains.cartserviceapp.repository;

import io.javabrains.cartserviceapp.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, Integer> {
}
