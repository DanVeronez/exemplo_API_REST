package br.com.certisign.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExemploInput {

	@NotBlank
	private String campo1;
	
	@NotNull
	@PositiveOrZero
	private BigDecimal campo2;
	
	@Valid
	@NotNull
	private String campo3;
	
}
