package com.app.sbprojpoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
 
	@GetMapping("/welcome")
	public String getData() {
		return "this is demo poc for springbootapp. will connect this with docker and kube";
	}
	
}
