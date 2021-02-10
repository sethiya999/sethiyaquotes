package com.example.quotes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesService {

	@GetMapping("/quote")
	public String quote() {
		return "Haste makes waste!!";
	}
}
