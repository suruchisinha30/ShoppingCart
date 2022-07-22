package io.javabrains.profileservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileResource {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World - from profile";
    }

}
