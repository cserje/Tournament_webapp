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
	
	@RequestMapping("/find")
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
	
	@RequestMapping(value="/addTournament", method=RequestMethod.GET)
	public String addTournament(Model model) {
		System.out.println("GET");
		model.addAttribute("tournament",new Tournament());
		return "tournament_add";
	}
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String saveTournament(@ModelAttribute Tournament tournament) {
		System.out.println("POST");
		System.out.println(tournament);
		return "tournaments";
	}

	@RequestMapping("/currentTournamentTemplate")
	public String goHome(Model model) {
		Tournament tournament = new Tournament();
		tournament.setName("Kiválasztott torna adatai");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		tournament.setDate("17/07/2018");
		tournament.setDescription("Hello ");
		model.addAttribute("currentTournament",tournament);
		return "current_tournament_template";
	}

}
