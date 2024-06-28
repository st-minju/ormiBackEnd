package com.barabam.springstudy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudyApplication {

  @Value("${kakap.api.key}")
  private String name;

  public static void main(String[] args) {

    SpringApplication.run(SpringStudyApplication.class, args);
  }
}
