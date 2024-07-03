package com.barabam.springjdbcstudy.service;

import com.barabam.springjdbcstudy.domain.Students;
import com.barabam.springjdbcstudy.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private final StudentRepository repository;

  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public int countStudents() {
    return repository.countStudents();
  }

  public List<Students> findStudents(Long id) {
    return repository.findStudents(id);
  }

  public void saveStudent(Students students) {
    repository.saveStudent(students);
  }
}
