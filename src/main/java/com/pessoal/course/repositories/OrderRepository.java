package com.pessoal.course.repositories;

import com.pessoal.course.entites.Order;
import com.pessoal.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
