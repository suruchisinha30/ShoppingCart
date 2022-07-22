package io.javabrains.paymentservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentResource {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World - from payment";
    }
}
