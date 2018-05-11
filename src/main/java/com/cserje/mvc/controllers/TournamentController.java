package com.cserje.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cserje.mvc.data.entities.Team;
import com.cserje.mvc.data.entities.Tournament;
import com.cserje.mvc.data.services.TournamentService;
 
@Controller
@RequestMapping("/tournament")
public class TournamentController {
	
	@Autowired
	protected TournamentService tournamentService; 
	
	@RequestMapping(value="/find")
	public String find(Model model)
	{
		model.addAttribute("tournaments", this.tournamentService.findAll());
		return "tournaments";
	}
	
	//Delete the selected tournament by it's id
	@RequestMapping(value="/delete/{projectId}")
	public String deleteTournament(Model model, @PathVariable Long projectId) {
		tournamentService.delete(tournamentService.find(projectId));
		model.addAttribute("tournaments", this.tournamentService.findAll());
		return "redirect:/tournament/find";
	}

	
	//Create a new tournament
	@RequestMapping(value="/addTournament", method=RequestMethod.GET)
	public String addTournament() {
		System.out.println("GET");
		return "tournament_add";
	}
	//Save the new tournament
	@RequestMapping(value="/addTournament", method=RequestMethod.POST)
	public String saveTournament(@ModelAttribute Tournament tournament, Model model) {
		System.out.println("POST");
		System.out.println(tournament);
		if(tempTournament!=null) {
			//tournamentService.find(tempTournament.getTournamentId()).modifyDetails(tournament);
			tournamentService.delete(tempTournament);
			tempTournament=null;}
		tournamentService.persist(tournament);
		model.addAttribute("tournaments", this.tournamentService.findAll());
		return "redirect:/tournament/find";
	}
	
	@RequestMapping(value="/{projectId}")
	public String tournamentDetails(Model model, @PathVariable Long projectId) {
		model.addAttribute("currentTournament", tournamentService.find(projectId));
		model.addAttribute("teams", tournamentService.find(projectId).getTeams());
		return "current_tournament";
	}
	@RequestMapping(value="/{projectId}/addTeam", method=RequestMethod.GET)
	public String createTeam(@PathVariable Long projectId) {
		return "team_add";
	}
	
	@RequestMapping(value="/{projectId}/addTeam", method=RequestMethod.POST)
	public String saveTeam(@PathVariable Long projectId, Model model, @ModelAttribute Team team) {
		this.tournamentService.find(projectId).addTeam(team);
		System.out.println(team.getName()+" "+team.getLeader());
		return "redirect:/tournament/"+projectId;
	}
	private Tournament tempTournament=null;
	
    @RequestMapping(value="/{projectId}/modifyTournament",method=RequestMethod.GET)
	public String modifyTournament(@PathVariable Long projectId, Model model) {
		model.addAttribute("tournament",tournamentService.find(projectId));
		tempTournament=tournamentService.find(projectId);
		//When we click on modify button, the record will be deleted immediately and then save the record again
		//tournamentService.delete(tournamentService.find(projectId));
    	return "tournament_modify";
	}
	//Save the new tournament
	@RequestMapping(value="/{projectId}/modifyTournament", method=RequestMethod.POST)
	public String savemodifiedTournament(@PathVariable Long projectId, @ModelAttribute Tournament tournament, Model model) {
		System.out.println("Módosítás controllermsad.");
		tournamentService.update(projectId,tournament);
		//tournamentService.find(projectId).update(tournament);
		model.addAttribute("tournaments", this.tournamentService.findAll());
		return "redirect:/tournament/find";
	}
}
