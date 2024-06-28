package com.barabam.springstudy;

public class UserRepository2 implements UserRepositoryInterface {

  @Override
  public void save(User user) {
    System.out.println("User save");
  }

  @Override
  public void delete(User user) {
    System.out.println("User delete");
  }
}
