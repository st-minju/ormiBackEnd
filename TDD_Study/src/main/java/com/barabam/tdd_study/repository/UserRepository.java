package com.barabam.tdd_study.repository;

import com.barabam.tdd_study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);

  boolean existsByEmail(String email);
}
