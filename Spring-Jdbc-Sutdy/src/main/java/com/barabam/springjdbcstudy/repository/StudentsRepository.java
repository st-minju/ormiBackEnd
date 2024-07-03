package com.barabam.springjdbcstudy.repository;

import com.barabam.springjdbcstudy.domain.Students;
import java.util.List;

public interface StudentsRepository {
  List<Students> findAll();

  int insertStudent(Students students);
}
