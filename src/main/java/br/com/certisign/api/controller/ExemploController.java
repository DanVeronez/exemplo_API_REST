package br.com.certisign.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.certisign.api.assembler.ExemploAssembler;
import br.com.certisign.api.model.ExemploModel;
import br.com.certisign.api.model.input.ExemploInput;
import br.com.certisign.domain.model.Exemplo;
import br.com.certisign.domain.service.ExemploService;

@RestController
@RequestMapping(value = "/exemplos")
public class ExemploController {

	@Autowired
	private ExemploAssembler exemploAssembler;
	
	@Autowired
	private ExemploService exemploService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ExemploModel create( @RequestBody @Valid ExemploInput exemploInput ) {
		
		Exemplo exemplo = exemploAssembler.toEntity( exemploInput );
		
		return exemploAssembler.toModel( exemploService.create( exemplo ) );
	}

}
