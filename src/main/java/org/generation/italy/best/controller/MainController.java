package org.generation.italy.best.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String getHome(Model model) {
		
		String myBest = "Lorenzo";
		
		model.addAttribute("Best", myBest);
		
		return "home";
		
	}
}
