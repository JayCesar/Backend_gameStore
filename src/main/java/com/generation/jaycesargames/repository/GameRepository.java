package com.generation.jaycesargames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.jaycesargames.model.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	public List<Game> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
