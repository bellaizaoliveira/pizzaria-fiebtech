package br.itb.projeto.pizzaria3f.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mensagem")
public class Mensagem {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private long id;
	private smalldatetime dataMensagem;
	private varchar emissorMensagem;
	private varchar telefone;
	private String texto;
	private varchar statusMensagem;

}
