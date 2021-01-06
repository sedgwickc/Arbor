package com.sedgwickc.ArborWeb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arbordata.Soil;

@RestController
public class SoilController {
	
	@RequestMapping("/soil")
	public String index() {
		Soil k;
		return "Greetings from ArborWeb via Spring Boot";
	}

}
