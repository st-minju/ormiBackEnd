package com.barabam.springstudy.study0701;

import com.barabam.springstudy.study0628.User;
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
