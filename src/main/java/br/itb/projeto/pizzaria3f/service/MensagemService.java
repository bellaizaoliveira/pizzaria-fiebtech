package br.itb.projeto.pizzaria3f.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3f.model.entity.Mensagem;
import br.itb.projeto.pizzaria3f.model.repository.MensagemRepository;

@Service
public class MensagemService {
	
	private MensagemRepository mensagemRepository;
	// Source -> Generate Constructor using Fields...

	public MensagemService(MensagemRepository mensagemRepository) {
		super();
		this.mensagemRepository = mensagemRepository;
	}

	public List<Mensagem> findAll() {
		List<Mensagem> mensagens = mensagemRepository.findAll();
		return mensagens;
	}
	
	public Mensagem findById(long id) {
		
		Mensagem mensagens = 
					mensagemRepository.findById(id).orElseThrow();
		
		return mensagens;
	}
	
}
