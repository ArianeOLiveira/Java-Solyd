package br.com.solyd.minhasfinancas.enums;

public enum Banco {
	NUBANK(260), BRADESCO(237), ITAU(341), SANTANDER(033);
	
	public int id;
	Banco(int id) {
		this.id = id;
	}
}
