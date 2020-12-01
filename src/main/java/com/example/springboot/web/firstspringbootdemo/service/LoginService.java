package com.example.springboot.web.firstspringbootdemo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("pushpak") && password.equalsIgnoreCase("shikhar");
	}
}
