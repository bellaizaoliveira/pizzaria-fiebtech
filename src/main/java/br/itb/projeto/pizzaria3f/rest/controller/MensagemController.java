package br.itb.projeto.pizzaria3f.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3f.model.entity.Mensagem;
import br.itb.projeto.pizzaria3f.service.MensagemService;

@RestController
@RequestMapping("/mensagem/")
public class MensagemController {
	
	
	private MensagemService mensagemService;

	// Source -> Generate Constructor using Fields...
	public MensagemController(MensagemService mensagemService) {
		super();
		this.mensagemService = mensagemService;
	}

	@GetMapping("findAll")
	public ResponseEntity<List<Mensagem>> findAll() {
		List<Mensagem> mensagens = 
				mensagemService.findAll();

		return new ResponseEntity<List<Mensagem>>
							(mensagens, HttpStatus.OK);
	}
	
	@GetMapping("findById/{id}")
	public ResponseEntity<Mensagem> findById(
			@PathVariable long id){
	
		Mensagem mensagens = mensagemService.findById(id);
		
		return new ResponseEntity<Mensagem>
					(mensagens, HttpStatus.OK);
		
	}
	


}


}
