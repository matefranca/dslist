package com.waked.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.waked.dslist.dto.GameListDTO;
import com.waked.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() { 
		return repository.findAll()
				.stream()
				.map(x -> new GameListDTO(x))
				.toList();
	}
}
