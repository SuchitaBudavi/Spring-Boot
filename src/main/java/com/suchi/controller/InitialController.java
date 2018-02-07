package com.suchi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {

	@RequestMapping("/hello")
	public String greeting() {
		return "Welcome!";
	}
	
	
}
