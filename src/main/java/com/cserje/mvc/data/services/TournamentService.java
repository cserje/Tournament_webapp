package com.cserje.mvc.data.services;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cserje.mvc.data.entities.Team;
import com.cserje.mvc.data.entities.Tournament;

@Service
public class TournamentService {

	private long id=0L;
	private List<Tournament> tournaments = new LinkedList<Tournament>();

	public TournamentService() {
		tournaments.add(createTournament("Init", "Munkacsarnok"));


	}

	private Tournament createTournament(String name, String description) {
		Tournament tournament = new Tournament();
		tournament.setTournamentId(id);
		
		tournament.setName(name);
		tournament.setDescription(description);
		tournament.addTeam(new Team((Long)id,1L,"CarpeDM","Cserje"));
		tournament.addTeam(new Team((Long)id,2L,"LSLParaszt","Pajor"));
		id++;
		return tournament;
	}
	
	public void persist(Tournament tournament) {
		
			tournament.setTournamentId(id);
			id++;
			tournaments.add(tournament);
		
	}
	
	public void update(Long id, Tournament tournament) {
	for(int i=0;i<tournaments.size();++i)
	{
		if(tournaments.get(i).getTournamentId()==id)
		{
			tournaments.get(i).setName(tournament.getName());
			tournaments.get(i).setDate(tournament.getDate());
			tournaments.get(i).setDescription(tournament.getDescription());
		}
	}
	}
	
	public void delete(Tournament tournament) {
		System.out.println(tournament.getTournamentId()+" id record deleted");
		
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
