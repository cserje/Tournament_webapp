package com.cserje.mvc.data.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Tournament {

	private Long tournamentId;
	private String name;
	private String date;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
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
	
	
}
