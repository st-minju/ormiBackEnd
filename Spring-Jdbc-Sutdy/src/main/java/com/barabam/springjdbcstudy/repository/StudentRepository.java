package com.barabam.springjdbcstudy.repository;

import com.barabam.springjdbcstudy.domain.Students;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
  private final StudentMapper studentMapper;

  public StudentRepository(StudentMapper studentMapper) {
    this.studentMapper = studentMapper;
  }

  public int countStudents() {
    return studentMapper.countStudents();
  }

  public List<Students> findStudents(Long id) {
    return studentMapper.findStudents(id);
  }

  public void saveStudent(Students students) {
    studentMapper.saveStudents(students);
  }
}
