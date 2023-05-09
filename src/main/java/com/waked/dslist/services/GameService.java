package com.waked.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waked.dslist.dto.GameMinDTO;
import com.waked.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll() { 
		return repository.findAll()
				.stream()
				.map(x -> new GameMinDTO(x))
				.toList();
	}
}
