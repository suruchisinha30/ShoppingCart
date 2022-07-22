package com.shoppingcart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.model.Product;
import com.shoppingcart.repository.IProductRepository;


@RestController
public class ProductController {

	@Autowired
    private IProductRepository repository;
    
    @GetMapping("/products")
    List<Product> getAll(){

		return repository.findAll();
    }
    
    
    @GetMapping("/")
    String demo() {
    	return "Hello World 1";
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
    String updateProduct(@RequestBody Product pro, @PathVariable Integer id) {
    	return repository.findById(id).map(
    			product -> {
    				product.setProduct_name(pro.getProduct_name());
    				 repository.save(product);
    				 return "Product name updated";
    				 
    			}).orElseGet(() -> {
    				repository.save(pro);
    				return "New Product added";
    				 
    			
    			});
    	
    }
}
