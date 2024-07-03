package com.barabam.springjdbcstudy.repository;

import com.barabam.springjdbcstudy.domain.Students;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentJdbcTemplateRepositoryTest {
  @Autowired
  @Qualifier("studentJdbcTemplateRepository")
  private StudentsRepository repository;

  @Test
  void insertTest() {
    Students students = new Students();
    students.setName("장이수");
    students.setAge(35);
    students.setAddress("서울");
    repository.insertStudent(students);
  }

  @Test
  void selectTest() {
    List<Students> list = repository.findAll();

    for (Students students : list) {
      System.out.print("ID: " + students.getId());
      System.out.print(", Name: " + students.getName());
      System.out.print(", Age: " + students.getAge());
      System.out.println(", Address: " + students.getAddress());
    }
  }
}
