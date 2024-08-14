package com.barabam.tdd_study.entity;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserTest {

  @Test
  public void testUserCreation() {
    User user = new User("max@gmail.com", "1234", "kim songjo");

    // then
    assertThat(user.getEmail()).isEqualTo("max@gmail.com");
    assertThat(user.getPassword()).isEqualTo("1234");
    assertThat(user.getName()).isEqualTo("kim songjo");
    assertThat(user.getId()).isNull();
    assertThat(user).isInstanceOf(User.class);
    assertThat(user.getPassword().length()).isEqualTo(4);
  }
}
