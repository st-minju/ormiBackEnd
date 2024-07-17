package com.barabam.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Long id;
	private String username;
	private String email;
	private boolean isAdmin;
	private String password;
}