package com.barabam.docker_compose_study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.barabam.docker_compose_study.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
