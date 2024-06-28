package com.barabam.springstudy;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements UserRepositoryInterface {

  @Override
  public void save(User user) {
    System.out.println("User save");
  }

  @Override
  public void delete(User user) {
    System.out.println("User delete");
  }
}
