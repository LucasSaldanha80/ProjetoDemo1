package br.inatel.projeto.projetoX.controller.form;

import br.inatel.projeto.projetoX.models.Postagem;
import br.inatel.projeto.projetoX.repository.PostagemRepository;

public class AtualizaPostagemForm {

	// @NotNull @NotEmpty
	private String titulo;

	// @NotNull @NotEmpty
	private String mensagem;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Postagem atualizar(Long id, PostagemRepository postagemRepository) {
		Postagem postagem = postagemRepository.getOne(id);
		
		postagem.setTitulo(this.titulo);
		postagem.setMensagem(this.mensagem);
		
		return postagem;
	}

}
