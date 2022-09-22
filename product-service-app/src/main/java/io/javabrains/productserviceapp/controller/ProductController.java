package io.javabrains.productserviceapp.controller;

import io.javabrains.productserviceapp.model.Product;
import io.javabrains.productserviceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/post")
    public ResponseEntity<Product> saveOrUpdate(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.saveOrUpdate(product), HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Product>> findAll() {
        return new ResponseEntity<List<Product>>(productService.findAll(), HttpStatus.ACCEPTED);
    }
    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody Product product) {
        productService.delete(product);
        return new ResponseEntity<String>("Product Removed Successfully", HttpStatus.ACCEPTED);
    }
    @GetMapping("/product/(productId)")
    public ResponseEntity<List<Product>> getProductById(@PathVariable Integer productId) {
        return new ResponseEntity<>((List<Product>) productService.getProductById(productId), HttpStatus.ACCEPTED);
    }
}
