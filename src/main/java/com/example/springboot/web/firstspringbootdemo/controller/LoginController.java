package com.example.springboot.web.firstspringbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.springboot.web.firstspringbootdemo.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
//@RequestParam String name, ModelMap model
	public String Welcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		boolean isValidUser = service.validateUser(name, password);
		if (!isValidUser) {
			model.put("error", "Login Credentials are wrong");
			return "login";
		}

		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String LoginMessage() {
		return "login";
	}

}
