package br.inatel.projeto.projetoX.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inatel.projeto.projetoX.models.Servico;

public interface ServicoRepository extends JpaRepository<Servico , Long> {

	Servico findByNome(String nomeServico);

}
