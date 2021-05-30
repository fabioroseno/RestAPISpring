package com.rs.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

	@GetMapping
	@ResponseStatus( code = HttpStatus.OK )
	public String ping() {
		String text = "API Spring Started!";
		System.out.println(text);
		return text;
	}
}
