package com.pessoal.course.repositories;

import com.pessoal.course.entites.Category;
import com.pessoal.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
