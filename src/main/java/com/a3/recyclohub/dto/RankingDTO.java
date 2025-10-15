package com.a3.recyclohub.dto;

public class RankingDTO {

	
	private String nomeUsuario;
	private int pontosVerdes;
	

	public RankingDTO() {
		
	}
	
	public RankingDTO( String nomeUsuario, int pontosVerdes) {
		this.nomeUsuario = nomeUsuario;
		this.pontosVerdes = pontosVerdes;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public int getPontosVerdes() {
		return pontosVerdes;
	}


	
	
	
	
	
	
	
	
	
	
	
	
}
