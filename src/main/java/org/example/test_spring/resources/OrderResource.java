package org.example.test_spring.resources;

import org.example.test_spring.entities.Order;
import org.example.test_spring.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderServices services;


    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> Orders = services.findAll();
        return ResponseEntity.ok().body(Orders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order Order = services.findById(id);
        return ResponseEntity.ok().body(Order);
    }

}
