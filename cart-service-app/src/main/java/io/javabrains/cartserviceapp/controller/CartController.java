package io.javabrains.cartserviceapp.controller;

import io.javabrains.cartserviceapp.model.Cart;
import io.javabrains.cartserviceapp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public ResponseEntity<Cart> saveOrUpdate(@RequestBody Cart cart) {
        return new ResponseEntity<Cart>(cartService.saveOrUpdate(cart), HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Cart>> findAll() {
        return new ResponseEntity<List<Cart>>(cartService.findAll(), HttpStatus.ACCEPTED);
    }

}
