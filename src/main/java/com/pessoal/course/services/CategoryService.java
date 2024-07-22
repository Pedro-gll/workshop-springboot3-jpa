package com.pessoal.course.services;

import com.pessoal.course.entites.Category;
import com.pessoal.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Conversa com o banco
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj= repository.findById(id);
        return obj.get();
    }


    
}
