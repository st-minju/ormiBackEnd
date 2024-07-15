package com.barabam.springstudy.study0709.noMain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

  @GetMapping("/index")
  public String index(Model model) {
    model.addAttribute("name", "김민주");
    model.addAttribute("age", "25");
    model.addAttribute("address", "경기도");
    model.addAttribute("mbti", "ESTP");
    model.addAttribute("food", "떡볶이");
    return "index";
  }
}
