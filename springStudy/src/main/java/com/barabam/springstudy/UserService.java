package com.barabam.springstudy;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepositoryInterface userRepository;

  public UserService(UserRepositoryInterface userRepository) {
    this.userRepository = userRepository;
  }

  public void createUser(User user) {
    userRepository.save(user);
  }

  public void deleteUser(User user) {
    userRepository.delete(user);
  }
}

/*package com.barabam.springstudy;

import org.springframework.stereotype.Service;

@Service
public class UserService2 {

	// 강결합
	// private UserRepository userRepository;
	private UserRepositoryInterface userRepository;

	// 스프링 전
  *//*private UserRepository2 userRepository2;
    private User user;

    public UserService() {
      this.userRepository = new UserRepository1();
      this.userRepository = new UserRepository2();
      this.user = new User();
    }*//*

           // 스프링 후
           public UserService(UserRepositoryInterface userRepository) {
           	this.userRepository = userRepository;
           }

           // 약결합
            *//*private UserRepositoryInterface userRepository;

                         public UserService(UserRepositoryInterface userRepository) {
                           this.userRepository = new UserRepository();
                         }*//*

                                                     	public void createUser(User user) {
                                                     		userRepository.save(user);
                                                     	}

                                                     	public void deleteUser(User user) {
                                                     		userRepository.delete(user);
                                                     	}
                                                     }*/
