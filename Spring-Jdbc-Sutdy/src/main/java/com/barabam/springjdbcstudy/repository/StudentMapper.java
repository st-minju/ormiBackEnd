package com.barabam.springjdbcstudy.repository;

import com.barabam.springjdbcstudy.domain.Students;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
  int countStudents();

  List<Students> findStudents(@Param("id") Long id);

  void saveStudents(Students students);
}
