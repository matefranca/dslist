package com.waked.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.waked.dslist.dto.GameDTO;
import com.waked.dslist.dto.GameMinDTO;
import com.waked.dslist.entities.Game;
import com.waked.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = repository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() { 
		return repository.findAll()
				.stream()
				.map(x -> new GameMinDTO(x))
				.toList();
	}
}
