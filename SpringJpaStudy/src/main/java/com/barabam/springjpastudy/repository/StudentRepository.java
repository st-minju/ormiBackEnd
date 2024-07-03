package com.barabam.springjpastudy.repository;

import java.util.List;

import com.barabam.springjpastudy.domain.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {

  List<Students> findByName(String name);
}
