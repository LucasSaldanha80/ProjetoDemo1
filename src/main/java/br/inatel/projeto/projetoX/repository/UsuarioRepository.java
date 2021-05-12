package br.inatel.projeto.projetoX.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inatel.projeto.projetoX.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);
	
}
