package br.inatel.projeto.projetoX.controller;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import br.inatel.projeto.projetoX.models.Postagem;
import br.inatel.projeto.projetoX.repository.PostagemRepository;

@SpringBootTest
public class PostagemControllerTest {
	
	private PostagemRepository postagemRepository;
	
	@Test
	public void DeveriaDetalharPostagem() {
		@SuppressWarnings("unused")
		Optional<Postagem> postar = postagemRepository.findById((long) 0);
	}
}
