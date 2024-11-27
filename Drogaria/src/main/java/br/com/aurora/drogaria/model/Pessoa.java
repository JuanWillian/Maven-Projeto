package br.com.aurora.drogaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain{
	@Column(length = 50, nullable = false)
	private String nome;
	@Column(length = 14, nullable =false)
	private String cpf;
	@Column(length = 12, nullable =false)
	private String rg;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
