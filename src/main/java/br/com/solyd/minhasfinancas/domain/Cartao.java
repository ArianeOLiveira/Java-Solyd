package br.com.solyd.minhasfinancas.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.solyd.minhasfinancas.enums.Bandeira;

@Entity
public class Cartao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String numero;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Bandeira bandeira;
	private String cvv;
	
	@NotNull
	private String validade;
	
	Cartao(String numero, String nome, Bandeira bandeira, String cvv, LocalDate validade) {
		this.numero = numero;
		this.nome = nome;
		this.bandeira = bandeira;
		this.cvv = cvv;
		setValidade(validade);
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/YYYY");
		this.validade = formatter.format(validade); 
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
