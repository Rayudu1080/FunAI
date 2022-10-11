package com.fun.ai;

import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {
	
	@RequestMapping("/home")
	public String sample() {
		System.out.println("Hello World!! Welcome to AI");
//		HttpResponse<String> response = Unirest.get("https://walnut-generator.p.rapidapi.com/wrt_transformer?payload=All%20dogs%20love%20to")
//				.header("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
//				.header("X-RapidAPI-Host", "walnut-generator.p.rapidapi.com")
//				.asString();
		return "home";
	}
}
