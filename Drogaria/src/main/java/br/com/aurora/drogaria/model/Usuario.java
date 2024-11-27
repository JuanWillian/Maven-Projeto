package br.com.aurora.drogaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@SuppressWarnings("serial")
@Entity
public class Usuario extends GenericDomain {
	@Column(length = 32, nullable = false)
	private String senha;
	@Column(nullable = false)
	private char tipo ;
	@Column(nullable= false)
	private boolean ativo;
	@OneToOne
	@JoinColumn(nullable=false)	
	private Pessoa pessoa;
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
