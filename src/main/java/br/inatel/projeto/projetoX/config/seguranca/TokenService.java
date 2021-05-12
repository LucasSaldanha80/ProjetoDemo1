package br.inatel.projeto.projetoX.config.seguranca;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

	public String gerarToken(Authentication authentication) {
		return Jwts;
	}

	
}
