package com.clubefutebol.ClubeFutebol.repository;

import org.springframework.data.repository.CrudRepository;

import com.clubefutebol.ClubeFutebol.Model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long>{
	Funcionario findById(long id);
}
