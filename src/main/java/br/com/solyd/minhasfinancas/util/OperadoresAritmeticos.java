package br.com.solyd.minhasfinancas.util;

public class OperadoresAritmeticos {

	@Soma
	public int soma(int a, int b) {
		return a + b;
	}
	
	public int subtracao(int a, int b) {
		return a - b;
	}
	
	public int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public double divisao(int a, int b ) throws ArithmeticException {
		return a / b;
	}
	
	public int resto(int a, int b) {
		return a % b;
	}

}
