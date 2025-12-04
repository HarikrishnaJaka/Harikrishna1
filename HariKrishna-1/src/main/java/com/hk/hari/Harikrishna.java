package com.hk.hari;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hari")
public class Harikrishna 
{
	@GetMapping("/wish")
	public String wish() {
		return "hello boss how are you";
	}
	@GetMapping("/greet")
	public String greet() {
		return "hello boss good morning";
	}

}
