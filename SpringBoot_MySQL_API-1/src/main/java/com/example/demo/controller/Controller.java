package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class Controller {
	@GetMapping
	public String hello() {
		return "hello world";
	}
	@GetMapping(value = "/callAPIHello")
	private String getHelloClient() {
		String uri = "http://localhost:8080/api";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
		
	}
}
