package com.clubefutebol.ClubeFutebol.repository;

import org.springframework.data.repository.CrudRepository;

import com.clubefutebol.ClubeFutebol.Model.Jogador;

public interface JogadorRepository extends CrudRepository<Jogador, Long>{
	Jogador findById(long id);
}
