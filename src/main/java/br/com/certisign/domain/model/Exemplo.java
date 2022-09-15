package br.com.certisign.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Exemplo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "campo1")
	private String campo1;
	
	@NotNull
	@Column(name = "campo2")
	private BigDecimal campo2;

	@NotBlank
	@Column(name = "campo3")
	private String campo3;
	
}
