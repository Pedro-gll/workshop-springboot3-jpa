package com.pessoal.course.repositories;

import com.pessoal.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
