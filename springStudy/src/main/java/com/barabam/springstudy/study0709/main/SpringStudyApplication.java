package com.barabam.springstudy.study0709.main;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.barabam.springstudy.study0709.noMain")
public class SpringStudyApplication {

  @Value("${server.port}")
  private int port;

  @Value("${spring.application.name}")
  private String appName;

  @PostConstruct
  public void printConfig() {
    System.out.println("포트번호: " + port);
    System.out.println("애플리케이션 이름: " + appName);
  }

  public static void main(String[] args) {

    /*    @Autowired
    @Qualifier("sendMessage")
    Message message;*/

    SpringApplication.run(SpringStudyApplication.class, args);
  }
}
