package com.cserje.mvc.data.services;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cserje.mvc.data.entities.Tournament;

@Service
public class TournamentService {

	private long id=0L;
	private List<Tournament> tournaments = new LinkedList<Tournament>();

	public TournamentService() {
		tournaments.add(createTournament("Init", "2018/04/22", "Munkacsarnok"));

	}

	private Tournament createTournament(String name, String date, String description) {
		Tournament tournament = new Tournament();
		tournament.setTournamentId(id);
		id++;
		tournament.setName(name);
		tournament.setDate(date);
		tournament.setDescription(description);
		return tournament;
	}
	
	public void persist(Tournament tournament) {
		tournament.setTournamentId(id);
		id++;
		tournaments.add(tournament);
	}
	
	public void delete(Tournament tournament) {
		tournaments.remove(tournament);
	}

	public List<Tournament> findAll() {
		return this.tournaments;
	}
	public Tournament find(Long projectId){
		return this.tournaments.stream().filter(p -> {
			return p.getTournamentId().equals(projectId);
		}).collect(Collectors.toList()).get(0);
	}
}
