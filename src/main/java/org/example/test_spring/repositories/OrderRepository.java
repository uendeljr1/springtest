package org.example.test_spring.repositories;

import org.example.test_spring.entities.Order;
import org.example.test_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
