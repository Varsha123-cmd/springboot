package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {
	@Autowired
	User user;
	@RequestMapping("/bank1name")
	public String getBankname() {
		return "Bank of India";
	}
	@RequestMapping("/bank1address")
	public String getBankaddress() {
		return "Karnataka";
	}
}
