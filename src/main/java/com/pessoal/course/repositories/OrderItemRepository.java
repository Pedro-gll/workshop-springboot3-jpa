package com.pessoal.course.repositories;

import com.pessoal.course.entites.OrderItem;
import com.pessoal.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
