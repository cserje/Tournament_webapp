package com.cserje.mvc.data.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Tournament {

	private Long tournamentId;
	private String name;
	private Date date;
	private String dateString;
	private String description;
	private List<Team> teams = new LinkedList<Team>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(Long tournamentId) {
		this.tournamentId = tournamentId;
	}
	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", name=" + name + ", date=" + date + ", description="
				+ description + "]";
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void addTeam(Team team) {
		teams.add(team);
	}
	
	public void modifyDetails(Tournament tournament) {
		this.name = tournament.getName();
		this.description = tournament.getDescription();
		this.date = tournament.getDate();
		this.tournamentId=tournament.getTournamentId();
		System.out.println("tournament copied");
	}
	
	//using for datepicker which default format is the same
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	public String getDateString() {
		
		
		if (date==null)
			return "";
		
		System.out.println(date.toString());
		 String result=formatter.format(date);
		 
		 return result;
	}
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	public void update(Tournament tournament) {
		this.name=tournament.getName();
		this.date=tournament.getDate();
		this.description=tournament.getDescription();
	}
	
}
