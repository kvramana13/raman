package com.practice.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping(value="/users")
	public String getUsers()
	{
		
		return "Demo application ";
		
	}
}
