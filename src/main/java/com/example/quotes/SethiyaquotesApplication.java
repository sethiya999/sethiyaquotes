package com.example.quotes;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SethiyaquotesApplication {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		String[] arr = { "It does not matter how slowly you go as long as you do not stop.",
				"All our dreams can come true, if we have the courage to pursue them.",
				"I never dreamed about success, I worked for it.",
				"Never bend your head. Always hold it high. Look the world straight in the eye.",
				"If you are not willing to risk the usual, you will have to settle for the ordinary.",
				"You only live once, but if you do it right, once is enough",
				"Once you choose hope, anything's possible.",
				"Try not to become a person of success, but rather try to become a person of value.",
				"The difference between winning and losing is most often not quitting",
				"If you're going through hell, keep going." };
		Random r = new Random();
		int randomNumber = r.nextInt(arr.length);
		String quote = arr[randomNumber];
		if(quote  == null) {
			quote = "Slow and steady wins the race!!";
		}
		return quote;
	}

	public static void main(String[] args) {
		SpringApplication.run(SethiyaquotesApplication.class, args);
	}

}

