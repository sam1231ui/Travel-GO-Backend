package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Admin;
import com.example.demo.services.AdminService;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://travelgo-front-end.vercel.app")

public class AdminController {
	
	@Autowired
	AdminService aservice;
	
	@GetMapping("/getalladmin")
	public List<Admin>getall()
	{
		return aservice.getall();
	}

}
