package com.barabam.springstudy.study0709.noMain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

  @GetMapping("/index")
  public String index(Model model) {
    model.addAttribute("name", "굿굿베리굿");
    return "index";
  }
}
