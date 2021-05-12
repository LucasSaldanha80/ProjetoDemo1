package br.inatel.projeto.projetoX.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.inatel.projeto.projetoX.models.Postagem;

public class PostagemDto {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeServico;

	public PostagemDto(Postagem postagem) {
		this.id = postagem.getId();
		this.titulo = postagem.getTitulo();
		this.mensagem = postagem.getMensagem();
		this.dataCriacao = postagem.getDataCriacao();
		this.nomeServico = postagem.getServico().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	public String getNomeServico() {
		return nomeServico;
	}

	public static Page<PostagemDto> converter(Page<Postagem> postagens) {
		return postagens.map(PostagemDto::new);
	}

}
