package com.waked.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waked.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
