package org.example.test_spring.resources;


import org.example.test_spring.entities.Product;
import org.example.test_spring.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductServices services;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> products = services.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = services.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
