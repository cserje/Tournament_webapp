package com.cserje.mvc.data.entities;

import java.io.Serializable;


public class Team implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long tournamentId;
	private Long id;
	private String name;
	private String leader;
	
	public Team() {}
	
	
	public Team(Long tournamentId, Long id, String name, String leader) {
		this.tournamentId=tournamentId;
		this.id=id;
		this.name=name;
		this.leader=leader;
	}
	
	public Long getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(Long tournamentId) {
		this.tournamentId = tournamentId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
}
