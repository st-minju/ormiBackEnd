package com.barabam.springjdbcstudy.controller;

import com.barabam.springjdbcstudy.domain.Students;
import com.barabam.springjdbcstudy.service.StudentService;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/students/count")
  public int countStudents() {
    return studentService.countStudents();
  }

  @GetMapping("/students")
  public List<Students> findStudents(@Param("id") Long id) {
    return studentService.findStudents(id);
  }

  @PostMapping(
      value = "/students",
      produces =
          MediaType
              .APPLICATION_JSON_VALUE) // POST /students {"name": "이름", "age": 나이, "address": "주소"}
  public String saveStudent(@RequestBody Students students) {
    studentService.saveStudent(students);
    return "Saved";
  }
}
