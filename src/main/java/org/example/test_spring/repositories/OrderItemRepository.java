package org.example.test_spring.repositories;

import org.example.test_spring.entities.Order;
import org.example.test_spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
