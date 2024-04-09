package br.itb.projeto.pizzaria3f.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3f.model.entity.Categoria;
import br.itb.projeto.pizzaria3f.model.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository categoriaRepository;
	// Source -> Generate Constructor using Fields...

	public CategoriaService(CategoriaRepository categoriaRepository) {
		super();
		this.categoriaRepository = categoriaRepository;
	}

	public List<Categoria> findAll() {
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias;
	}
	
	public Categoria findById(long id) {
		
		Categoria categoria = 
					categoriaRepository.findById(id)
						.orElseThrow();
		
		return categoria;
	}
	
}
