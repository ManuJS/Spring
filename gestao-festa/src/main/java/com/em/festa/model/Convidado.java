package com.em.festa.model;

/**
 * @author Emanuelle Menali
 *
 */
public class Convidado {
	
	private String nome; 
	private Integer quantidadeDeAcompanhantes;
	
	public Convidado(){}

	public Convidado(String nome, Integer quantidadeAcompanhantes) {
		this.nome = nome;
		this.quantidadeDeAcompanhantes = quantidadeAcompanhantes;
		}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeDeAcompanhantes() {
		return quantidadeDeAcompanhantes;
	}

	public void setQuantidadeDeAcompanhantes(Integer quantidadeDeAcompanhantes) {
		this.quantidadeDeAcompanhantes = quantidadeDeAcompanhantes;
	}
	
	

}
