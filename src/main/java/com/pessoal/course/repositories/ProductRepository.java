package com.pessoal.course.repositories;

import com.pessoal.course.entites.Category;
import com.pessoal.course.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
