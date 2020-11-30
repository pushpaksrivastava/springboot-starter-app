package com.example.springboot.web.firstspringbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.POST)
//@RequestParam String name, ModelMap model
	public String Welcome(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String LoginMessage() {
		return "login";
	}

}
