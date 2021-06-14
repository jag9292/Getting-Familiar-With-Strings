package com.Green.gettingFamiliarStrings;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("dojos/{dojo}")
	public String dojo(@PathVariable("dojo")String dojo) {
		return "The Dojo is awesome!";
	}
	
	@RequestMapping("dojos/{burbank-dojo}")
	public String burbank(@PathVariable("burbank-dojo")String burbank) {
		return burbank;
	}
}
