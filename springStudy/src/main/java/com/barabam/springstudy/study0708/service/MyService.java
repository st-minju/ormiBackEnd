package com.barabam.springstudy.study0708.service;

import com.barabam.springstudy.study0708.util.Helper;
import com.barabam.springstudy.study0708.util.Test1;
import com.barabam.springstudy.study0708.util.Test2;
import com.barabam.springstudy.study0708.util.Test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyService {

  private final Helper helper;
  private final Test1 test1;
  private final Test2 test2;
  private final Test3 test3;

  public String hello() {
    System.out.println(this.helper);
    return "Hello, Spring Boot!";
  }
}
