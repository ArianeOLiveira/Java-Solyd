package br.com.solyd.minhasfinancas.exceptions;

public class CPFException extends RuntimeException {

	public CPFException() {
		super("Favor verificar o CPF informado.");
	}
}
