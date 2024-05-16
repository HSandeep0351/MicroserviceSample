package com.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.dao.TeamDAO;
import com.first.entity.Team;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	final TeamDAO teamDAO;
	
	@Autowired
	TeamController(TeamDAO teamDAO){
		this.teamDAO=teamDAO;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Team> addTeam(@RequestBody Team team){
		return ResponseEntity.ok(teamDAO.addTeam(team));
	}
}
