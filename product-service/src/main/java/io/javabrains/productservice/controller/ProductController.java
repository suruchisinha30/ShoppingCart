package io.javabrains.productservice.controller;
import io.javabrains.productservice.model.Product;
import io.javabrains.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping("/")
    String print() {
        return "Hello World 2";
    }

    @GetMapping("/products")
    List<Product> getAll(){

        return repository.findAll();
    }

    @GetMapping("/product/{id}")
    Optional<Product> getProduct(@PathVariable Integer id){
        if((repository.findById(id)).isEmpty())
            return Optional.empty();

        else {
            return repository.findById(id);
        }
    }

    @PostMapping("/products")
    String addProduct(@RequestBody Product pro) {
        if((repository.findById(pro.getProduct_id())).isEmpty()) {
            repository.save(pro);
            return "Product Added";
        }

        else {
            return "Given product id already exists";
        }
    }

    @PostMapping("/delete/{id}")
    String deleteProduct(@PathVariable Integer id)
    {
        if((repository.findById(id)).isEmpty())
            return "No Product present with this id";

        else {
            repository.deleteById(id);
            return "Product id "+id +" deleted successfully";
        }
    }

    @PutMapping("/products/{id}")
    String updateProduct(@RequestBody Product pro, @PathVariable Integer product_id) {
        return repository.findById(product_id).map(
                product -> {
                    product.setProduct_name(pro.getProduct_name());
                    product.setProduct_id(pro.getProduct_id());
                    product.setProduct_type(pro.getProduct_type());
                    repository.save(product);
                    return "Product name updated";

                }).orElseGet(() -> {
            repository.save(pro);
            return "New Product added";


        });

    }

}
