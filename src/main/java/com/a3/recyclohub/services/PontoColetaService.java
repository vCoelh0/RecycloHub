package com.a3.recyclohub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a3.recyclohub.dto.PontoColetaDTO;
import com.a3.recyclohub.entites.PontoColeta;
import com.a3.recyclohub.entites.repositories.PontoColetaRepository;

@Service
public class PontoColetaService {
	
	@Autowired
	private PontoColetaRepository repository;
	
	public PontoColetaDTO cadastrar(PontoColetaDTO dto) {
		
		PontoColeta pcoleta = new PontoColeta();
		
		pcoleta.setNome(dto.getNome());
		pcoleta.setEndereco(dto.getEndereco());
		pcoleta.setTipoResiduo(dto.getTipoResiduo());

		pcoleta = repository.save(pcoleta);
	
		return new PontoColetaDTO(pcoleta);
				
	}
	
}
