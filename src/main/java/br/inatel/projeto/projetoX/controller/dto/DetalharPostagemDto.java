package br.inatel.projeto.projetoX.controller.dto;

import java.time.LocalDateTime;

import br.inatel.projeto.projetoX.models.Postagem;

public class DetalharPostagemDto {

	private Long id;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private String emailAutor;
	private String nomeServico;
	
	public DetalharPostagemDto(Postagem postagem) {
		this.id = postagem.getId();
		this.dataCriacao = postagem.getDataCriacao();
		this.nomeAutor = postagem.getAutor().getNome();
		this.emailAutor = postagem.getAutor().getEmail();
		this.nomeServico = postagem.getServico().getNome();
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}
	
	public String getEmailAutor() {
		return emailAutor;
	}

	public String getNomeServico() {
		return nomeServico;
	}
}
