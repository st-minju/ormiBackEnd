package com.barabam.docker_compose_study.service;

import org.springframework.stereotype.Service;

import com.barabam.docker_compose_study.entity.User;
import com.barabam.docker_compose_study.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public User createUser(String username, String email) {
    return userRepository.save(new User(username, email));
  }

  public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
  }
}
