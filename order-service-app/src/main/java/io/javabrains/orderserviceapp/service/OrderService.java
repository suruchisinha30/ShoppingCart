package io.javabrains.orderserviceapp.service;

import io.javabrains.orderserviceapp.model.Order;
import io.javabrains.orderserviceapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrUpdate(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public void delete(Order order) {
        orderRepository.delete(order);
    }

}
