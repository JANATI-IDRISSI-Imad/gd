package com.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.web.services.CommandeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CommandeController {
	@Autowired
	CommandeService commandeService;
	
}
