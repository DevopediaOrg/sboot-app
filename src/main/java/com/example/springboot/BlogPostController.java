package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPostController {

	@GetMapping("/post/{id}")
	public String showPost(@PathVariable String id) {
		return "Blog post with id " + id;
	}
}
