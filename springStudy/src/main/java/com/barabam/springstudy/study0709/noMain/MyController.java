package com.barabam.springstudy.study0709.noMain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class MyController {

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }
}
