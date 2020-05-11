package br.com.solyd.minhasfinancas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.solyd.minhasfinancas.enums.TipoCategoria;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="tipo")
	private TipoCategoria tipoCategoria;
	
	Categoria(String nome, Long id, TipoCategoria tipoCategoria) {
		this.nome = nome;
		this.id = id;
		this.tipoCategoria = tipoCategoria;
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
	
	public TipoCategoria getTipoCategoria() {
		return tipoCategoria;
	}
	
	public void setTipoCategoria(TipoCategoria tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
}
