package br.com.certisign.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.certisign.api.model.ExemploModel;
import br.com.certisign.api.model.input.ExemploInput;
import br.com.certisign.domain.model.Exemplo;

@Component
public class ExemploAssembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public Exemplo toEntity( ExemploInput input ) {
		return modelMapper.map( input, Exemplo.class );
	}
	
	
	public ExemploModel toModel( Exemplo restaurante ) {
		return modelMapper.map(restaurante, ExemploModel.class);
	}

	
}
