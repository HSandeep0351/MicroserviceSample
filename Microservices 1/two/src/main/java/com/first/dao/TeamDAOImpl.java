package com.first.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.first.entity.Team;
import com.first.repository.TeamRepository;

@Repository
public class TeamDAOImpl implements TeamDAO{
	
	final TeamRepository teamRepo;
	
	@Autowired
	TeamDAOImpl(TeamRepository teamRepo) {
		this.teamRepo=teamRepo;
	}
	
	@Override
	public Team addTeam(Team team) {
		return teamRepo.save(team);
	}
}
