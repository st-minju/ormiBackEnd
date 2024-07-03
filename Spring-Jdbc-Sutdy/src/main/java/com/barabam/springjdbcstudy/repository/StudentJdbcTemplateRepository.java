package com.barabam.springjdbcstudy.repository;

import com.barabam.springjdbcstudy.domain.Students;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcTemplateRepository implements StudentsRepository {

  private final JdbcTemplate jdbcTemplate;

  public StudentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public List<Students> findAll() {
    return jdbcTemplate.query(
        "SELECT * FROM students",
        (rs, rowNum) ->
            new Students(
                rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("address")));
  }

  @Override
  public int insertStudent(Students students) {
    int result =
        jdbcTemplate.update(
            "INSERT INTO students (id, name, age, address) VALUES (?, ?, ?, ?)",
            students.getId(),
            students.getName(),
            students.getAge(),
            students.getAddress());
    return result;
  }
}
