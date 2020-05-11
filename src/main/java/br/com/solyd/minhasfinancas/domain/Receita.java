package br.com.solyd.minhasfinancas.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.solyd.minhasfinancas.enums.TipoReceita;

@Entity
public class Receita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Transacao transacao;
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	private TipoReceita tipo;

	public Receita(Transacao transacao, BigDecimal valor, TipoReceita tipo) {
		this.tipo = tipo;
		this.valor = valor;
		this.transacao = transacao;
	}

	public Transacao getTransacao() {
		return transacao;
	}

	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoReceita getTipo() {
		return tipo;
	}

	public void setTipo(TipoReceita tipo) {
		this.tipo = tipo;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
