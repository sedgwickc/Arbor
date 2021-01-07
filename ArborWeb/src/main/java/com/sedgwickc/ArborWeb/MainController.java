package com.sedgwickc.ArborWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arbordata.Soil;

// do not use @RestController when using jsp files
@Controller
public class MainController {
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		String greeting = "Greetings from ArborWeb via Spring Boot";
		model.addAttribute("greeting", greeting);
		return "index";
	}
	
	@RequestMapping(value = {"/soils"}, method = RequestMethod.GET)
	public String viewSoils(Model model) {
		Soil k;
		String soilsGreeting = "Available soils: TODO";
		model.addAttribute("soilsGreeting", soilsGreeting);
		return "soils";
	}

}
