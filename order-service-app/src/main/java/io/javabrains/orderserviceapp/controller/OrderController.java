package io.javabrains.orderserviceapp.controller;

import io.javabrains.orderserviceapp.model.Order;
import io.javabrains.orderserviceapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/post")
    public ResponseEntity<Order> saveOrUpdate(@RequestBody Order order) {
        return new ResponseEntity<Order>(orderService.saveOrUpdate(order), HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Order>> findAll() {
        return new ResponseEntity<List<Order>>(orderService.findAll(), HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@RequestBody Order order) {
        orderService.delete(order);
        return new ResponseEntity<String>("Order cancelled", HttpStatus.ACCEPTED);
    }
}
