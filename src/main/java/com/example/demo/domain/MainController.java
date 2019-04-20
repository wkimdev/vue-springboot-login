package com.example.demo.domain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@GetMapping({"/"})
	public String main(Model model) {
		model.addAttribute("eventName", "FIFA 2018");
		return "index";
	}

}
