package com.academia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.DTO.RegistrationDto;
import com.academia.entity.User;
import com.academia.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class RegistrationController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
		public User addUser (@RequestBody RegistrationDto regDto) {
		User user = userService.addUser(regDto);
		return user;
	}
}
