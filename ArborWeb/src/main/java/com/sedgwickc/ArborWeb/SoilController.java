package com.sedgwickc.ArborWeb;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import arbordata.Soil;

// do not use @RestController when using jsp files
@Controller
public class SoilController {
	
	@Autowired
	private ISoilService soilService;
	
	@RequestMapping(value = {"/soils"}, method = RequestMethod.GET)
	public String viewSoils(ModelMap model) {
		model.put("soils", soilService.getSoils());
		return "soils";
	}
	
	@RequestMapping(value = {"/add-soil"}, method=RequestMethod.POST)
	public String addSoil(ModelMap model, @Valid Soil soil, BindingResult result) {
		if (result.hasErrors() ) {
			return "soils";
		}
		
		soilService.saveSoil(soil);
		return "redirect:/soils";
	}
	
	@RequestMapping(value = "/add-soil", method = RequestMethod.GET)
	public String showAddSoilPage(ModelMap model) {
		model.addAttribute("soil", new Soil());
		return "add-soil";
	}

}
