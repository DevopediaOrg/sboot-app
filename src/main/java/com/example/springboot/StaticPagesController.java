package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticPagesController {

	@GetMapping("/")
	public String homepage() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/about-us")
	public String aboutUs() {
		return "About Us page!";
	}

	@GetMapping("/contact-us")
	public String contactUs() {
		return "Contact form is shown here!";
	}
}
