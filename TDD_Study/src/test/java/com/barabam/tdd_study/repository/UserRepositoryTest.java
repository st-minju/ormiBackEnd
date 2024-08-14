package com.barabam.tdd_study.repository;

import static org.assertj.core.api.Assertions.*;

import com.barabam.tdd_study.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestPropertySource(locations = "classpath:application.yml")
public class UserRepositoryTest {

  @Autowired private TestEntityManager entityManager;

  @Autowired private UserRepository userRepository;

  @Test
  public void testFindByEmail() {
    User user = new User("test@gmail.com", "password", "max");

    entityManager.persist(user);
    entityManager.flush();

    User found = userRepository.findByEmail("test@gmail.com");

    assertThat(found.getPassword()).isEqualTo(user.getPassword());
    assertThat(found.getEmail()).isEqualTo(user.getEmail());
    assertThat(found.getName()).isEqualTo(user.getName());
  }
}
