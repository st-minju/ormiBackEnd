package com.barabam.tdd_study;

import java.util.Optional;

public interface UserRepository {
  Optional<User> findById(Long id);
}
