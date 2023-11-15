package com.ericdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long >{
	
	
	
}
