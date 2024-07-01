package com.barabam.springstudy.springboot;

import com.barabam.springstudy.User;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
  Map<String, User> users = new HashMap<>();

  public User getUser(String key) {
    users.put("max", new User("max", "max@gmail.com", 20));
    return users.get(key);
  }
}
