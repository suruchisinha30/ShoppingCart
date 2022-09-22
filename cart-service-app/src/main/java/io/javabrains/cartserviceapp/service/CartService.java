package io.javabrains.cartserviceapp.service;

import io.javabrains.cartserviceapp.model.Cart;
import io.javabrains.cartserviceapp.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart saveOrUpdate(Cart cart) {
        return cartRepository.save(cart);
    }
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }
}
