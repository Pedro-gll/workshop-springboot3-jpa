package com.pessoal.course.repositories;

import com.pessoal.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNome(String nome);
}
