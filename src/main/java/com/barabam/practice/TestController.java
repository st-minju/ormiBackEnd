package com.barabam.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
	private List<User> users = new ArrayList<>();
	private List<Product> products = new ArrayList<>();
	private long userId = 1L;
	private long productId = 1L;

	@GetMapping("/index")
	public String test(Model model) {
		return "index";
	}

	@GetMapping("/users")
	public String users(Model model) {
		if(users.isEmpty()) {
			users.add(new User(userId++, "max", "max@gmail.com", false, "1234"));
			users.add(new User(userId++, "min", "min@gmail.com", true, "1234"));
		}

		model.addAttribute("users", users);
		return "users";
	}

	@GetMapping("/users/form")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "form";
	}

	@PostMapping("/users/new")
	public String addUser(@ModelAttribute User user, Model model) {
		user.setId(userId++);
		user.setAdmin(false);
		users.add(user);
		model.addAttribute("user", user);

	    System.out.println("이름: " + user.getUsername());
	    System.out.println("이메일: " + user.getEmail());
	    System.out.println("패스워드: " + user.getPassword());

		return "redirect:/users/new";
	}

	@GetMapping("/users/new")
	public String confirmNewUser(Model model){
		User user = users.stream()
			.filter(u -> u.getId() == userId-1)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException());

		model.addAttribute("user", user);
		return "new";
	}

	@GetMapping("/products")
	public String products(Model model) {
		if(products.isEmpty()) {
			products.add(new Product(productId++, "apple", 2000));
			products.add(new Product(productId++, "banana", 3000));
			products.add(new Product(productId++, "melon", 10000));
			products.add(new Product(productId++, "watermelon", 8000));
		}

		model.addAttribute("products", products);
		return "products";
	}

}
