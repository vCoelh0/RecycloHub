package com.a3.recyclohub.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ranking")
public class Ranking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long idUsuario;
	private int pontuacao;
	private int posicao;
	
	
	// =============  CONSTRUTTORES, GETTERS E SETTERS =============
	public Ranking() {
		
	}


	public Ranking(Long idUsuario, int pontuacao, int posicao) {
		this.idUsuario = idUsuario;
		this.pontuacao = pontuacao;
		this.posicao = posicao;
	}


	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public int getPontuacao() {
		return pontuacao;
	}


	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}


	public int getPosicao() {
		return posicao;
	}


	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	
	
	
}
