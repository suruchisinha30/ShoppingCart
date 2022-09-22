package io.javabrains.orderserviceapp.repository;

import io.javabrains.orderserviceapp.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Integer> {
}
