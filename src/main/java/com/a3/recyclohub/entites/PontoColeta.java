package com.a3.recyclohub.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pontocoleta")
public class PontoColeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String endereco;
	private int capacidadeTotal;
	
	// =============  CONSTRUTTORES, GETTERS E SETTERS =============
	
	public PontoColeta() {
		
	}

	public PontoColeta(Long id, String nome, String endereco, int capacidadeTotal) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.capacidadeTotal = capacidadeTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setTipoResiduo(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}
	
	
	
	
}
