package br.inatel.projeto.projetoX.controller.form;

//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;

import br.inatel.projeto.projetoX.controller.form.PostagemForm;
import br.inatel.projeto.projetoX.models.Postagem;
import br.inatel.projeto.projetoX.models.Servico;
import br.inatel.projeto.projetoX.repository.ServicoRepository;

public class PostagemForm {

	//@NotNull @NotEmpty
	private String titulo;
	//@NotNull @NotEmpty
	private String mensagem;
	//@NotNull @NotEmpty
	private String nomeServico;

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

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public Postagem converter(ServicoRepository servicoRepository) {
		Servico servico = servicoRepository.findByNome(nomeServico);
		return new Postagem(titulo, mensagem, servico);
	}

}
