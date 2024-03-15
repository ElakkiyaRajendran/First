package com.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
	@GetMapping(value="/getValue")
	public String get() {
		return "This is My First Project";
	}

}
