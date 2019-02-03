package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/hello")
@RestController
public class HelloController {
	private static final String RESPONSE_TEXT = "Hello world from '%s': %d\n";
	private int count = 0;
	
	@GetMapping
	public String helloWorld() {
		count++;
		return String.format(RESPONSE_TEXT, System.getenv().getOrDefault("HOSTNAME", "unknown"), count);
	}
}
