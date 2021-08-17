package com.example.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.dto.User;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@GetMapping("/get/{id}")
	public String get(@PathVariable Long id, @RequestParam String name) {
		return id + " " + name;
	}
	
	@PostMapping("/post")
	public User post(@RequestBody User user) {
		return user;
	}
}
