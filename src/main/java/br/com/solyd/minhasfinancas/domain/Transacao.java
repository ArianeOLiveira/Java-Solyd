package br.com.solyd.minhasfinancas.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import br.com.solyd.minhasfinancas.enums.Banco;

@Entity
public class Transacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal valor;
	private LocalDateTime data;
	
	@ManyToOne
	private Categoria categoria;
	private String descricao;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Banco banco;
	
	@ManyToOne
	private Conta destino;
	
	public Transacao(BigDecimal valor, LocalDateTime data, Categoria categoria, String descricao,
			Banco banco, Conta conta) {
		this.valor = valor;
		this.data = data;
		this.categoria = categoria;
		this.descricao = descricao;
		this.banco = banco;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Conta getDestino() {
		return destino;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}
	
}