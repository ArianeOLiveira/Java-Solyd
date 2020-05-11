package br.com.solyd.minhasfinancas.util;

import java.util.Arrays;

import br.com.solyd.minhasfinancas.domain.Usuario;

public class Array {

	Usuario[] usuarios = new Usuario[2];
	
	public void adiciona(Usuario usuario) {
		for (int i = 0; i < this.usuarios.length; i++) {
			if (this.usuarios[i] == null) {
				this.usuarios[i] = usuario;
				break;
			}
		}
	}
	
	public Usuario pega(int posicao) {
		return this.usuarios[posicao];
	}
	
	public void remove(int posicao) {
		this.usuarios[posicao] = null;
	}
	
	public boolean contem(Usuario usuario) {
		 for (int i = 0; i < this.usuarios.length; i++) {
			 if (usuario == this.usuarios[i]) {
				return true; 
			 }
		 }
		 return false;
	}
	
	public int tamanho() {
		return this.usuarios.length;
	}
	
	public String toString() {
		return Arrays.toString(usuarios);
	}
}
