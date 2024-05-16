package com.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{

}
