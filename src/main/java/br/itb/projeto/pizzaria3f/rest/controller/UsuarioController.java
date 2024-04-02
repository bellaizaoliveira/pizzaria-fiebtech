package br.itb.projeto.pizzaria3f.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3f.model.entity.Usuario;
import br.itb.projeto.pizzaria3f.service.UsuarioService;

@RestController
@RequestMapping("/usuario/")
public class UsuarioController {

	private UsuarioService usuarioService;

	// Source -> Generate Constructor using Fields...
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

	@GetMapping("findAll")
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> usuarios = 
				usuarioService.findAll();

		return new ResponseEntity<List<Usuario>>
							(usuarios, HttpStatus.OK);
	}
	
	@GetMapping("findById/{id}")
	public ResponseEntity<Usuario> findById(
			@PathVariable long id){
		
		Usuario usuario = usuarioService.findById(id);
		
		return new ResponseEntity<Usuario>
					(usuario, HttpStatus.OK);
		
	}

}








