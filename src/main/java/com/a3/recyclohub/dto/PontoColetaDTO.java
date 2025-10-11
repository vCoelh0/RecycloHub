package com.a3.recyclohub.dto;

import com.a3.recyclohub.entites.PontoColeta;

public class PontoColetaDTO {
		
	private Long id;
	private String nome;
	private String endereco;
	private String tipoResiduo;
	
	
	// =============  CONSTRUTTORES, GETTERS E SETTERS =============
	
	public PontoColetaDTO() {
		
	}
	
	public PontoColetaDTO(Long id, String nome, String endereco, String tipoResiduo) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.tipoResiduo = tipoResiduo;
	}
	
	public PontoColetaDTO(PontoColeta entity) {
		id = entity.getId();
		nome = entity.getNome();
		endereco = entity.getEndereco();
		tipoResiduo = entity.getTipoResiduo();

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
	public String getTipoResiduo() {
		return tipoResiduo;
	}
	
	
}
