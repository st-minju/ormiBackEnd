package com.barabam.springjdbcsutdy.repository;

import com.barabam.springjdbcsutdy.domain.Student;
import java.util.List;

public interface StudentRepository {
  List<Student> findAll();

  int insertStudent(Student student);
}
