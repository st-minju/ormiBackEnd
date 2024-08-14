package com.barabam.tdd_study;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
  private Long id;
  private String username;

  public User(Long id, String username) {
    this.id = id;
    this.username = username;
  }

  // Getters and setters
}
