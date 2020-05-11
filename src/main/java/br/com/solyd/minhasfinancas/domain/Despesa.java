package br.com.solyd.minhasfinancas.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Despesa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Transacao transacao;
	private Double valor;
	private LocalDate data;
	private Boolean despesaCartao;
	
	@ManyToOne
	private Cartao cartao;
	private Integer quantidadeParcela;
	private Double taxa;
	
	public Despesa(Transacao transacao, Double valor, LocalDate data, Boolean despesaCartao,
			Cartao cartao, Integer quantidadeParcela, Double taxa ) {
		this.transacao = transacao;
		this.valor = valor;
		this.data = data;
		this.despesaCartao = despesaCartao;
		this.cartao = cartao;
		this.quantidadeParcela = quantidadeParcela;
		this.taxa = taxa;
	}

	public Transacao getTransacao() {
		return transacao;
	}

	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Boolean getParcelado() {
		return quantidadeParcela > 0;
	}

	public Integer getQuantidadeParcela() {
		return quantidadeParcela;
	}

	public void setQuantidadeParcela(Integer quantidadeParcela) {
		this.quantidadeParcela = quantidadeParcela;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Boolean getDespesaCartao() {
		return despesaCartao;
	}

	public void setDespesaCartao(Boolean despesaCartao) {
		this.despesaCartao = despesaCartao;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
