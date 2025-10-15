package com.a3.recyclohub.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a3.recyclohub.dto.DescarteDTO;
import com.a3.recyclohub.entites.Descarte;
import com.a3.recyclohub.entites.PontoColeta;
import com.a3.recyclohub.entites.Usuario;
import com.a3.recyclohub.entites.repositories.DescarteRepository;
import com.a3.recyclohub.entites.repositories.PontoColetaRepository;
import com.a3.recyclohub.entites.repositories.UsuarioRespository;

@Service
public class DescarteService {

	@Autowired
	private DescarteRepository descarteRepository;
	
	@Autowired
	private UsuarioRespository usuarioRepository;
 
	@Autowired
	private PontoColetaRepository pontoColetaRepository;
	
	public DescarteDTO cadastrar(DescarteDTO dto, Long usuarioId) {
		Usuario usuario = usuarioRepository.findById(usuarioId)
				.orElseThrow(() -> new RuntimeException("Usuario não encontrado!"));
		
		PontoColeta ponto = pontoColetaRepository.findById(dto.getIdPontoColeta())
				.orElseThrow(() -> new RuntimeException("Ponto de coleta não encontrado!"));
		
		Descarte descarte = new Descarte();
		descarte.setTipoResiduo(dto.getTipoResiduo());
		descarte.setQuantidade(dto.getQuantidade());
		descarte.setDataHora(LocalDate.now());
		descarte.setUsuario(usuario);
		descarte.setPontoColeta(ponto);
		
		descarte = descarteRepository.save(descarte);
		
		int pontosGanhos = dto.getQuantidade();
		usuario.setPontosVerdes(usuario.getPontosVerdes() + pontosGanhos);
		usuarioRepository.save(usuario);
		
		return new DescarteDTO(descarte);

	}
	
}