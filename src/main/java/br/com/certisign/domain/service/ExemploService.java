package br.com.certisign.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.certisign.domain.exception.ExemploException;
import br.com.certisign.domain.model.Exemplo;
import br.com.certisign.domain.repository.ExemploRepository;

@Service
public class ExemploService {

	@Autowired
	private ExemploRepository exemploRepository;
	
	@Transactional
	public Exemplo create( Exemplo restaurante) {
		
		//TODO: regra
		if ( true ) {
			throw new ExemploException( "Erro de negocio" );
		}
		
		
		return exemploRepository.save(restaurante);
	}

	
}
