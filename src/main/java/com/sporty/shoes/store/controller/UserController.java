package com.sporty.shoes.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sporty.shoes.store.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/userdata")
	public String userList(Model model) {

		model.addAttribute("listUsers", userService.getAllUsers());
		return "userList";

	}
}
