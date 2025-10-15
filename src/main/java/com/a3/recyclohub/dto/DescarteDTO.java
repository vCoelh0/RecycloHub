package com.a3.recyclohub.dto;

import java.time.LocalDate;

import com.a3.recyclohub.entites.Descarte;
import com.a3.recyclohub.entites.PontoColeta;
import com.a3.recyclohub.entites.Usuario;

public class DescarteDTO {
	
	private Long id;

    private Long idUsuario;
    private Long idPontoColeta;
    private String tipoResiduo;
    private int quantidade;
    private LocalDate dataHora;
    
    
 // ============= CONSTRUTORES, GETTERS E SETTERS =============
    
    public DescarteDTO() {
    }
    
    
    public DescarteDTO(Long id, Long idUsuario, Long idPontoColeta, String tipoResiduo, int quantidade, LocalDate dataHora) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idPontoColeta = idPontoColeta;
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataHora = dataHora;
    }
    
    
    public DescarteDTO(Descarte entity) {
        this.id = entity.getId();

        // Evita NullPointerException se o descarte não tiver relações carregadas
        Usuario usuario = entity.getUsuario();
        PontoColeta ponto = entity.getPontoColeta();

        this.idUsuario = (usuario != null) ? usuario.getId() : null;
        this.idPontoColeta = (ponto != null) ? ponto.getId() : null;

        this.tipoResiduo = entity.getTipoResiduo();
        this.quantidade = entity.getQuantidade();
        this.dataHora = entity.getDataHora();
    
    }


	public Long getId() {
		return id;
	}


	public Long getIdUsuario() {
		return idUsuario;
	}


	public Long getIdPontoColeta() {
		return idPontoColeta;
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

