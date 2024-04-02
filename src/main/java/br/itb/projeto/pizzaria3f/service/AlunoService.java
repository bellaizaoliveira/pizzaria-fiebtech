package br.itb.projeto.pizzaria3f.service;

import java.util.ArrayList;
import java.util.List;

import br.itb.projeto.pizzaria3f.model.entity.Aluno;
import br.itb.projeto.pizzaria3f.model.repository.AlunoRepository;

public class AlunoService implements AlunoRepository {

	@Override
	public Aluno find() {
		Aluno aluno = new Aluno(98765, "Ordnael", 35);
		return aluno;
	}

	@Override
	public List<Aluno> findAll() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(98765, "Ordnael", 35));
		alunos.add(new Aluno(98768, "Airam", 2));
		alunos.add(new Aluno(98761, "Ana", 7));
		return alunos;
	}

	@Override
	public Aluno findByRm(long rm) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(98765, "Ordnael", 35));
		alunos.add(new Aluno(98768, "Airam", 2));
		alunos.add(new Aluno(98761, "Ana", 7));
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getRm() == rm) {
				return alunos.get(i);
			}
		}
		return null;
	}

	

}


