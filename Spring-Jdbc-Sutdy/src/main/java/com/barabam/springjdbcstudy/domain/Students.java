package com.barabam.springjdbcstudy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Students {
  private long id;
  private String name;
  private int age;
  private String address;

  public Students(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }
}
