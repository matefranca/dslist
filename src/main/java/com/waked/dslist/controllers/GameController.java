package com.waked.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waked.dslist.dto.GameDTO;
import com.waked.dslist.dto.GameMinDTO;
import com.waked.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return service.findById(id);		
	}
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		return service.findAll();		
	}
}
