package br.inatel.projeto.projetoX.config.validacao;

public class ErroDeFormularioDto {
	
	//qual campo deu erro
	private String campo;
	//qual erro aconteceu
	private String erro;
	
	public ErroDeFormularioDto(String campo, String erro) {
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}
	
}
