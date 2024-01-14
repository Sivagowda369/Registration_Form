package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User_Dtls;
import com.example.demo.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController
{
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute User_Dtls u,HttpSession session) 
	{
		
		System.out.println(u);
		repo.save(u);
		session.setAttribute("message", "user register successfully");
		
		
		return "redirect:/";
		
	}

}
