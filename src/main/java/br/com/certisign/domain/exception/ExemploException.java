package br.com.certisign.domain.exception;

public class ExemploException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExemploException(String mensagem) {
		super(mensagem);
	}
	
	public ExemploException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
