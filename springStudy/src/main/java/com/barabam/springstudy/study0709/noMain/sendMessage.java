package com.barabam.springstudy.study0709.noMain;

import org.springframework.stereotype.Component;

@Component
public class sendMessage implements Message {

  @Override
  public void print() {
    System.out.println("Hello, World");
  }
}
