package com.barabam.springjpastudy.service;

import com.barabam.springjpastudy.domain.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {

  @Autowired private StudentService studentService;

  @Test
  public void insertTest() {
    Students student = new Students("제니", 28, "서울시");
    studentService.insertStudent(student);
  }
}
