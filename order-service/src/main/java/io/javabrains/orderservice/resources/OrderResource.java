package io.javabrains.orderservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderResource {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World - from order";
    }
}
