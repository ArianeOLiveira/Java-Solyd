package br.com.solyd.minhasfinancas.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.solyd.minhasfinancas.enums.TipoUsuario;

@Entity
@Table(name= "login")
public class Usuario implements Comparable<Usuario> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Integer idade;
	
	@NotNull
	private String email;
	
	@NotNull
	private String login;
	
	@NotNull
	private String senha;
	
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipo;
	
	Usuario(String nome, Integer idade, String email, String login, String senha, TipoUsuario tipo) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public String toString() {
		return this.idade.toString();
		//return this.login + " que possui a senha : " + retornarSenha();
	}
	
	public void imprimirInformacao() {
		System.out.println("Informa��es do usu�rio " + this.login);
	}

	@Override
	public int compareTo(Usuario o) {
		if (this.idade < o.idade) {
			return -1;
		} else if (this.idade > o.idade) {
			return 1;
		}
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
