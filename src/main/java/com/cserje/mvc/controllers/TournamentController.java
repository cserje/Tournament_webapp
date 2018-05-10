package com.cserje.mvc.controllers;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cserje.mvc.data.entities.Tournament;
import com.cserje.mvc.data.services.TournamentService;
 
@Controller
@RequestMapping("/tournament")
public class TournamentController {
	
	@Autowired
	private TournamentService tournamentService; 
	
	@RequestMapping(value="/find")
	public String find(Model model)
	{
		model.addAttribute("tournaments", this.tournamentService.findAll());
		return "tournaments";
	}
	
	@RequestMapping(value="/{projectId}")
	public String findTournament(Model model, @PathVariable Long projectId) {
		model.addAttribute("currentTournament", this.tournamentService.find(projectId));
		return "current_tournament_template";
	}
	
	@RequestMapping(value="/delete/{projectId}")
	public String deleteTournament(Model model, @PathVariable Long projectId) {
		tournamentService.delete(tournamentService.find(projectId));
		model.addAttribute("tournaments", this.tournamentService.findAll());
		return "tournaments";
	}
	
	@RequestMapping(value="/addTournament", method=RequestMethod.GET)
	public String addTournament() {
		System.out.println("GET");
		return "tournament_add";
	}
	@RequestMapping(value="/addTournament", method=RequestMethod.POST)
	public String saveTournament(@ModelAttribute Tournament tournament, Model model) {
		System.out.println("POST");
		System.out.println(tournament);
		tournamentService.persist(tournament);
		model.addAttribute("tournaments", this.tournamentService.findAll());
		return "tournaments";
	}
	
	

}
