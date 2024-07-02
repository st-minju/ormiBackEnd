package com.barabam.springjdbcsutdy.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.barabam.springjdbcsutdy.domain.Student;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentJdbcTemplateRepositoryTest {
  @Autowired
  @Qualifier("studentJdbcTemplateRepository")
  private StudentRepository repository;

  @Test
  void insertTest() {
    Student student = new Student();
    student.setName("장이수");
    student.setAge(35);
    student.setAddress("서울");
    repository.insertStudent(student);
  }

  @Test
  void selectTest() {
    List<Student> list = repository.findAll();

    for (Student student : list) {
      System.out.print("ID: " + student.getId());
      System.out.print(", Name: " + student.getName());
      System.out.print(", Age: " + student.getAge());
      System.out.println(", Address: " + student.getAddress());
    }
  }
}
