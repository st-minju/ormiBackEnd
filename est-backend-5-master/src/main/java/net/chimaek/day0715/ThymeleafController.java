package net.chimaek.day0715;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafController {

    @GetMapping("/index")
    public String index(Model model) {
        User max = new User("max", "max@gmail.com", true, false);
        int[] iterData = {1,2,3,4,5};
        model.addAttribute("user", max);
        model.addAttribute("iterData", iterData);
        return "index";
    }
}