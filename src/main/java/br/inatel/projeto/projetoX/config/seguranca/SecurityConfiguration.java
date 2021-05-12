package br.inatel.projeto.projetoX.config.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private AutenticacaoService autenticacaoService;
	
	//devolve o AuthenticationManager e injeta no controller
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	//login aplicação
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//algoritmo de hash para proteger a senha com BCrypt
		auth.userDetailsService(autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	//configura autorização a url desejada
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/postagens").permitAll()
		.antMatchers(HttpMethod.GET, "/postagens/*").permitAll()
		.antMatchers(HttpMethod.POST, "/auth").permitAll()
		.anyRequest().authenticated()
		//proteção contra o invasao da aplicação através do csrf
		.and().csrf().disable()
		//autenticação sem criar session
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	//configura requisição do front
	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}
	
	//printar o hash gerado pelo BCrypt
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode(""));
	}
	
}
