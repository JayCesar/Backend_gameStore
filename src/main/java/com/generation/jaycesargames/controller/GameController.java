package com.generation.jaycesargames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.jaycesargames.model.Game;
import com.generation.jaycesargames.repository.GameRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/games")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GameController {

	/*@Autowired
	private GameRepository gameRepository;
	
	@GetMapping
	public ResponseEntity<List<Game>> getAll(){
		return ResponseEntity.ok(gameRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Game> getById(@PathVariable Long id){
		return gameRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Game>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(gameRepository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<Game> post(@Valid @RequestBody Game game){
		if (gameRepository.existsById(game.getCategoria().getId()))
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(gameRepository.save(game));
			
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Game não existe!", null);
	}

	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Game> postagem = gameRepository.findById(id);
		
		if(postagem.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		gameRepository.deleteById(id);				
	}*/
	
}
