package com.pessoal.course.services;

import com.pessoal.course.entites.Order;
import com.pessoal.course.entites.User;
import com.pessoal.course.repositories.OrderRepository;
import com.pessoal.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Conversa com o banco
@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj= repository.findById(id);
        return obj.get();
    }


    
}
