package com.barabam.springstudy.study0628;

public class Singleton {

  private static final Singleton instance = new Singleton();

  private Singleton() {}

  public static Singleton getInstance() {
    return instance;
  }
}
