package br.com.solyd.minhasfinancas.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.solyd.minhasfinancas.enums.Mes;

@Entity
public class Planejamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private BigDecimal tetoDeGasto;
	private BigDecimal poupanca;
	private BigDecimal investimento;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Mes mes;
	
	Planejamento(BigDecimal tetoDeGasto, BigDecimal poupanca, BigDecimal investimento, Mes mes) {
		this.tetoDeGasto = tetoDeGasto;
		this.poupanca = poupanca;
		this.investimento = investimento;
		this.mes = mes;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getTetoDeGasto() {
		return tetoDeGasto;
	}

	public void setTetoDeGasto(BigDecimal tetoDeGasto) {
		this.tetoDeGasto = tetoDeGasto;
	}

	public BigDecimal getPoupanca() {
		return poupanca;
	}

	public void setPoupanca(BigDecimal poupanca) {
		this.poupanca = poupanca;
	}

	public BigDecimal getInvestimento() {
		return investimento;
	}

	public void setInvestimento(BigDecimal investimento) {
		this.investimento = investimento;
	}

}
