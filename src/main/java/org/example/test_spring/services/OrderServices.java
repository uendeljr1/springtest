package org.example.test_spring.services;

import org.example.test_spring.entities.Order;
import org.example.test_spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {
    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll() {
        return OrderRepository.findAll();
    }

    public Order findById(Long id) {

        Optional<Order> order = OrderRepository.findById(id);
        return order.get();

    }
}
