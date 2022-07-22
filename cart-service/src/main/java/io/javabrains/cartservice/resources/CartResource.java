package io.javabrains.cartservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartResource {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World - from cart";
    }
}