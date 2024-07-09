/*
package com.barabam.springstudy.study0628;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudyApplication {

  @Value("${kakao.api.key}")
  private String name;

  public static void main(String[] args) {
    // UserRepositoryInterface userRepository = new UserRepository();
    // UserRepositoryInterface userRepository2 = new UserRepository2();

    // UserService userService1 = new UserService(new UserRepository());
    // UserService userService2 = new UserService(new UserRepository2());

    // userService1.createUser(new User());
    // userService2.createUser(new User());

    // SpringApplication.run(SpringStudyApplication.class, args);

    */
/*Singleton singleton = Singleton.getInstance();
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    System.out.println(singleton);
    System.out.println("====================================");
    System.out.println(singleton1);
    System.out.println("====================================");
    System.out.println(singleton2);
*//*

  */
/*System.out.println("====================================");
Singleton singleton3 = new Singleton();
System.out.println(singleton3);
System.out.println("====================================");
Singleton singleton4 = new Singleton();
System.out.println(singleton4);*//*


                                 */
/*EmailService emailService = new EmailService(new SmtpEmailSender());
EmailService emailService1 = new EmailService(new AwsSesEmailSender());

emailService.sendEmail("제니", "지수", "hi!");
emailService1.sendEmail("로제", "리사", "hello!");*//*


                                                    User model = new User("김민주", "hi@gmail.com", 25);
                                                    UserView userView = new UserView();
                                                    UserController userController = new UserController(model, userView);

                                                    userController.updateView();
                                                    System.out.println(" ");
                                                    userController.setUserName("바라바라밤");
                                                    userController.setUserAge(20);
                                                    userController.updateView();
                                                  }
                                                }
                                                */
