package com.cserje.mvc.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cserje.mvc.data.entities.Tournament;

//command+shift+o shortcut: organize imports
@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome(Model model) {
		return "home";
	}
	
	@RequestMapping("/addProject")
	public String addProject() {
		return "project_add";
	}
}
