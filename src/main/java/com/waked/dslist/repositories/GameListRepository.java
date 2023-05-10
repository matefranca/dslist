package com.waked.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waked.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
