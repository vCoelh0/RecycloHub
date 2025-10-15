package com.a3.recyclohub.entites;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_descarte")
public class Descarte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private PontoColeta pontoColeta;
	
	private String tipoResiduo;
	private int quantidade;
	private LocalDate dataHora;
	
	
	// =============  CONSTRUTTORES, GETTERS E SETTERS =============
	
	public Descarte() {
		
	}


	public Descarte(Long id, Usuario usuario, PontoColeta pontoColeta, String tipoResiduo, int quantidade,
			LocalDate dataHora) {
		this.id = id;
		this.usuario = usuario;
		this.pontoColeta = pontoColeta;
		this.tipoResiduo = tipoResiduo;
		this.quantidade = quantidade;
		this.dataHora = dataHora;
	}


	public Long getId() {
		return id;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public PontoColeta getPontoColeta() {
		return pontoColeta;
	}


	public String getTipoResiduo() {
		return tipoResiduo;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public LocalDate getDataHora() {
		return dataHora;
	}
	
	
	
	
	
	
}
