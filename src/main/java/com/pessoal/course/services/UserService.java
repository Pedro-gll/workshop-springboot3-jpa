package com.pessoal.course.services;

import com.pessoal.course.entites.User;
import com.pessoal.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//Conversa com o banco
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj= repository.findById(id);
        return obj.get();
    }

    public User getById(Long id){
        return repository.findById(id).get();
    }

    public User findbyName(String nome) {
        Optional<User> obj = repository.findByNome(nome);
        return obj.get();
    }
}
