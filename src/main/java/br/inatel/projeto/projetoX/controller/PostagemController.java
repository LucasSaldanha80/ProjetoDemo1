package br.inatel.projeto.projetoX.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.inatel.projeto.projetoX.controller.dto.DetalharPostagemDto;
import br.inatel.projeto.projetoX.controller.dto.PostagemDto;
import br.inatel.projeto.projetoX.controller.form.AtualizaPostagemForm;
import br.inatel.projeto.projetoX.controller.form.PostagemForm;
import br.inatel.projeto.projetoX.models.Postagem;
import br.inatel.projeto.projetoX.repository.PostagemRepository;
import br.inatel.projeto.projetoX.repository.ServicoRepository;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

	@Autowired
	private PostagemRepository postagemRepository;

	@Autowired
	private ServicoRepository servicoRepository;

	@GetMapping  //configuração de cache        
	@Cacheable(value = "listaPostagens")                  //configuração de paginação
	public Page<PostagemDto> lista(@RequestParam(required = false) String nomeServico, 
			@PageableDefault(sort = "dataCriacao", page = 0, size = 10, direction = Direction.DESC) Pageable paginacao) {
		
		if (nomeServico == null) {
			Page<Postagem> postagens = postagemRepository.findAll(paginacao);
			return PostagemDto.converter(postagens);
		} else {
			Page<Postagem> postagens = postagemRepository.findByServico_Nome(nomeServico, paginacao);
			return PostagemDto.converter(postagens);
		}
	}

	@PostMapping
	@Transactional
	@CacheEvict(value = "listaPostagens", allEntries = true) //invalidando o cache
	public ResponseEntity<PostagemDto> postar(@RequestBody PostagemForm form, UriComponentsBuilder uriBuilder) {
		
		Postagem postagem = form.converter(servicoRepository);
		postagemRepository.save(postagem);

		URI uri = uriBuilder.path("/postagens/{id}").buildAndExpand(postagem.getId()).toUri();
		return ResponseEntity.created(uri).body(new PostagemDto(postagem));
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalharPostagemDto> detalhar(@PathVariable Long id) {
		
		Optional<Postagem> postar = postagemRepository.findById(id);

		// tratamento de erro 404
		if (postar.isPresent()) {
			return ResponseEntity.ok(new DetalharPostagemDto(postar.get()));
		}

		return ResponseEntity.notFound().build();
	}

	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaPostagens", allEntries = true) //invalidando o cache
	public ResponseEntity<PostagemDto> atualiza(@PathVariable Long id, @RequestBody /* @Valid */ AtualizaPostagemForm form) {
		
		Optional<Postagem> postar = postagemRepository.findById(id);

		// tratamento de erro 404
		if (postar.isPresent()) {
			Postagem postagem = form.atualizar(id, postagemRepository);
			return ResponseEntity.ok(new PostagemDto(postagem));
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaPostagens", allEntries = true) //invalidando o cache
	public ResponseEntity<PostagemDto> deleta(@PathVariable Long id) {
		
		Optional<Postagem> postar = postagemRepository.findById(id);
		
		// tratamento de erro 404
		if (postar.isPresent()) {
			postagemRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}
