package com.barabam.springjpastudy.service;

import com.barabam.springjpastudy.domain.Students;
import com.barabam.springjpastudy.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Students> selectAllStudents() {
    return studentRepository.findAll();
  }

  public List<Students> selectStudentsByName(String studentName) {
    return studentRepository.findByName(studentName);
  }

  public Students insertStudent(Students students) {
    return studentRepository.save(students);
  }
}
