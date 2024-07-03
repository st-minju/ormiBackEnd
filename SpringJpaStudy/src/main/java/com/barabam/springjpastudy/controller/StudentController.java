package com.barabam.springjpastudy.controller;

import com.barabam.springjpastudy.domain.Students;
import com.barabam.springjpastudy.service.StudentService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/students")
  public List<Students> getStudents() {
    return studentService.selectAllStudents();
  }

  @GetMapping("/students/{name}")
  public List<Students> getStudentsByName(@PathVariable String name) {
    return studentService.selectStudentsByName(name);
  }
}
