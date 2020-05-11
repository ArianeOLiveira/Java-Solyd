package br.com.solyd.minhasfinancas.util;

public class Repeticao {
	
	public void repetirInformacao(int quantidade) {
		
		for (int a = 15; a <= quantidade; a++) {
			System.out.println("for -" + a);
		}
		
		int b = 15;
		while (b <= quantidade) {
			System.out.println("while - " + b);
			b++;
		}
		
		int c = 15;
		do {
			System.out.println("do while -" + c);
			c++;
		} while (c <= quantidade);
		
	}

}
