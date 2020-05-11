package br.com.solyd.minhasfinancas.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.solyd.minhasfinancas.enums.Banco;
import br.com.solyd.minhasfinancas.enums.TipoConta;

@Entity
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Banco banco;
	
	@NotNull
	private String agencia;
	
	@NotNull
	private String conta;
	
	@Embedded
	@AttributeOverride(name = "valor", column=@Column(name="cpf"))
	private CPF cpf;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoConta tipo;
	private String nome;

	public Conta(Banco banco, String agencia, String conta, CPF cpf, TipoConta tipo, String nome) {
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.cpf = cpf;
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public Conta(Banco banco, String agencia, String conta, CPF cpf, TipoConta tipo) {
		new Conta(banco, agencia, conta, cpf, tipo, null);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public CPF getCpf() {
		return cpf;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
