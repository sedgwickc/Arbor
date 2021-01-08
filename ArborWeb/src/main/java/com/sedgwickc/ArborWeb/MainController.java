package com.sedgwickc.ArborWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arbordata.Soil;

// do not use @RestController when using jsp files
@Controller
public class MainController {
	
	@Autowired
	private ISoilService soilService;
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		String greeting = "Greetings from ArborWeb via Spring Boot";
		model.addAttribute("greeting", greeting);
		return "index";
	}

}
