package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TKA")
public class MyController {

	@RequestMapping(value = "/java", method = RequestMethod.POST)
	public String firstApi() {
		return "java is an OOP base Language ... !";
	}

	@PutMapping("/python")
	public String secondApi() {
		return "python used with AI ML ... !";
	}

	@DeleteMapping("/sql")
	public String thirdApi() {
		return "sql is an DB language ... !";
	}

	@PostMapping("/html")
	public String fourthApi() {
		return "html stand hypertext markup languges  ... !";
	}

	@PutMapping("/js")
	public String fifthApi() {
		return "JS used for both F & B ... !";
	}

	@PostMapping("/register")
	public void register() {
		
	}
}
