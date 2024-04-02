package br.itb.projeto.pizzaria3f.model.repository;

import java.util.List;

import br.itb.projeto.pizzaria3f.model.entity.Aluno;

public interface AlunoRepository {

	Aluno find();
	
	List<Aluno> findAll();
		
	Aluno findByRm(long rm);
}



