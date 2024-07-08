package com.barabam.springstudy.study0708.repository;

import com.barabam.springstudy.study0708.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
