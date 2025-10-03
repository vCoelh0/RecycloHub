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
	private String id;
	
	private String nome;
	private String endereco;
	private String tipoResiduo;
	
	// =============  CONSTRUTTORES, GETTERS E SETTERS =============
	
	public PontoColeta() {
		
	}

	public PontoColeta(String id, String nome, String endereco, String tipoResiduo) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.tipoResiduo = tipoResiduo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getTipoResiduo() {
		return tipoResiduo;
	}

	public void setTipoResiduo(String tipoResiduo) {
		this.tipoResiduo = tipoResiduo;
	}
	
	
	
	
}
