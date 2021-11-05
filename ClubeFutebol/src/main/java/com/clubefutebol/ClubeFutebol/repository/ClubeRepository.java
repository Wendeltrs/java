package com.clubefutebol.ClubeFutebol.repository;

import org.springframework.data.repository.CrudRepository;

import com.clubefutebol.ClubeFutebol.Model.Clube;

public interface ClubeRepository extends CrudRepository<Clube, Long>{
	Clube findById(long id);
}
