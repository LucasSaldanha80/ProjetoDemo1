package br.inatel.projeto.projetoX.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.inatel.projeto.projetoX.models.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem , Long> {

	Page<Postagem> findByServico_Nome(String nomeServico, Pageable paginacao);	
}
