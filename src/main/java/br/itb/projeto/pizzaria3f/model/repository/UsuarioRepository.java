package br.itb.projeto.pizzaria3f.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.pizzaria3f.model.entity.Usuario;

@Repository
public interface UsuarioRepository extends 
			  JpaRepository<Usuario, Long>{
	
	Usuario findByEmail(String email);

}






