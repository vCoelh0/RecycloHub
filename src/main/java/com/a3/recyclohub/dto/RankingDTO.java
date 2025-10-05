package com.a3.recyclohub.dto;

import com.a3.recyclohub.entites.Ranking;

public class RankingDTO {
private Long id;
	
	private Long idUsuario;
	private int pontuacao;
	private int posicao;
	
	
	public RankingDTO(Long id, Long idUsuario, int pontuacao, int posicao) {
		this.id = id;
		this.idUsuario = idUsuario;
		this.pontuacao = pontuacao;
		this.posicao = posicao;
	}

	
	public RankingDTO(Ranking entity) {
		id = entity.getId();
		idUsuario = entity.getIdUsuario();
		pontuacao = entity.getPontuacao();
		posicao = entity.getPosicao();

	}

	

	public Long getId() {
		return id;
	}


	public Long getIdUsuario() {
		return idUsuario;
	}


	public int getPontuacao() {
		return pontuacao;
	}


	public int getPosicao() {
		return posicao;
	}
	
	
	
	
	
	
	
	
	
	
	
}
