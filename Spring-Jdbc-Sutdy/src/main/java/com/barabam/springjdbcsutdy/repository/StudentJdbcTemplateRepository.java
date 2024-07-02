package com.barabam.springjdbcsutdy.repository;

import com.barabam.springjdbcsutdy.domain.Student;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcTemplateRepository implements StudentRepository {

  private final JdbcTemplate jdbcTemplate;

  public StudentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public List<Student> findAll() {
    return jdbcTemplate.query(
        "SELECT * FROM students",
        (rs, rowNum) ->
            new Student(
                rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("address")));
  }

  @Override
  public int insertStudent(Student student) {
    int result =
        jdbcTemplate.update(
            "INSERT INTO students (id, name, age, address) VALUES (?, ?, ?, ?)",
            student.getId(),
            student.getName(),
            student.getAge(),
            student.getAddress());
    return result;
  }
}
