package br.com.solyd.minhasfinancas.util;

public class Condicional {

	public void verificaFaixaEtaria(int idade) {
		if (idade <= 12) {
			System.out.println("De 0 a 12 anos");
		} else if (idade > 12 && idade <= 18) {
			System.out.println("De 13 a 18 anos");
		} else {
			System.out.println("Maior que 18 anos");
		}
	}

	public void retornaDia(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Hoje é segunda-feira");
			break;
		case 2:
			System.out.println("Hoje é terça-feira");
			break;
		case 3:
			System.out.println("Hoje é quarta-feira");
			break;
		case 4:
			System.out.println("Hoje é quinta-feira");
			break;
		case 5:
			System.out.println("Hoje é sexta-feira");
			break;
		case 6:
			System.out.println("Hoje é sábado");
			break;
		case 7:
			System.out.println("Hoje é domingo");
			break;
		default:
			System.out.println("Não é um dia da semana");
		}
	}
	
	public String verificarMaiorIdade(int idade) {
		return (idade >= 18) ? "Maior de idade" : "Menor de idade";
	}
}
