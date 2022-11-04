package com.baba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/")
	public String helloWorld() {
		return "{\"message\":\"Hello, Baba is live now\"}";
	}
}
