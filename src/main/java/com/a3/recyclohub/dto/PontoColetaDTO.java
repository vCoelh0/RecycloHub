package com.a3.recyclohub.dto;

import com.a3.recyclohub.entites.PontoColeta;

public class PontoColetaDTO {
		
	private Long id;
	private String nome;
	private String endereco;
	private int capacidadeTotal;
	
	
	// =============  CONSTRUTTORES, GETTERS E SETTERS =============
	
	public PontoColetaDTO() {
		
	}
	
	public PontoColetaDTO(Long id, String nome, String endereco, int capacidadeTotal) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.capacidadeTotal = capacidadeTotal;
	}
	
	public PontoColetaDTO(PontoColeta entity) {
		id = entity.getId();
		nome = entity.getNome();
		endereco = entity.getEndereco();
		capacidadeTotal = entity.getCapacidadeTotal();

	}
	
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}
	
	
}
