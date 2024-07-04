package com.barabam.springjpastudy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Students {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column private String name;

  @Column private int age;

  @Column private String address;

/*  @Enumerated(EnumType.STRING)
  private RoleType roleType;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createAt;*/

  public Students(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }
}
