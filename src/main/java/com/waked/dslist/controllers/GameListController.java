package com.waked.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waked.dslist.dto.GameListDTO;
import com.waked.dslist.dto.GameMinDTO;
import com.waked.dslist.services.GameListService;
import com.waked.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService service;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		return service.findAll();		
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findAll(@PathVariable Long listId) {
		return gameService.findByList(listId);
	}
}
